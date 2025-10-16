package old.connection.repository;

import old.connection.Conexao;
import domain.model.Forncedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorRepository {
    public void cadastrarFornecedor(Forncedor forncedor) throws SQLException {
        String query = "INSERT INTO Fornecedor (nome, cnpj) VALUES (?, ?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, forncedor.getNome());
            stmt.setString(2, forncedor.getCnpj());
            stmt.executeUpdate();
        }
    }
}
