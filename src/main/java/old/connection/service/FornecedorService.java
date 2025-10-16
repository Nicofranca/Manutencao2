package old.connection.service;

import old.connection.repository.FornecedorRepository;
import old.connection.view.MenuFornecedor;

import java.sql.SQLException;

public class FornecedorService {

    MenuFornecedor menuFornecedor = new MenuFornecedor();
    FornecedorRepository fornecedorRepository = new FornecedorRepository();

    public void cadastrarFornecedor(){
        var novoFornecedor = menuFornecedor.cadastrarFornecedor();

        try {
            fornecedorRepository.cadastrarFornecedor(novoFornecedor);
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
