package application.usecase;

import application.dto.CadastroFornecedorDTO;
import application.port.api.FornecedorService;
import domain.model.Fornecedor;
import domain.port.repository.FornecedorRepository;
import java.util.Optional.*;

public class FornecedorServiceImpl implements FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public FornecedorServiceImpl(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }


    @Override
    public Fornecedor cadastrarNovoFornecedor(CadastroFornecedorDTO dadosCadastro) {

        if(fornecedorRepository.buscarCnpj(dadosCadastro.cnpj()).isPresent()){
            throw new IllegalArgumentException("Já existe um fornecedor com este CNPJ!");
        }

        Fornecedor novoFornecedor = new Fornecedor(dadosCadastro.nome(), dadosCadastro.cnpj());
        return fornecedorRepository.salvar(novoFornecedor);
    }
}
