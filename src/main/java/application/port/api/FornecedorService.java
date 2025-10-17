package application.port.api;

import application.dto.CadastroFornecedorDTO;
import domain.model.Fornecedor;

public interface FornecedorService {
    Fornecedor cadastrarNovoFornecedor(CadastroFornecedorDTO dadosCadastro);
}
