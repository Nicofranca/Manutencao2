package domain.port.repository;

import domain.model.Fornecedor;

import java.util.Optional;

public interface FornecedorRepository {

    Fornecedor salvar(Fornecedor fornecedor);

    Optional<Fornecedor> buscarCnpj(String cnpj);
}
