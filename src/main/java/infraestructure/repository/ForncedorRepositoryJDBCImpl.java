package infraestructure.repository;

import domain.model.Fornecedor;
import domain.port.repository.FornecedorRepository;
import infraestructure.connection.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ForncedorRepositoryJDBCImpl implements FornecedorRepository {

    @Override
    public Fornecedor salvar(Fornecedor fornecedor) {
        String query = "INSERT INTO Fornecedor (nome, cnpj) VALUES (?, ?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.executeUpdate();

            return new Fornecedor(fornecedor.getNome(), fornecedor.getCnpj());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Fornecedor> buscarCnpj(String cnpj) {
        String query = "SELECT id, nome, cnpj FROM Fornecedor WHERE cnpj = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cnpj);

            try(ResultSet rs = stmt.executeQuery()) {
                if (rs.next()){
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor.setNome(rs.getString("nome"));
                    fornecedor.setCnpj(rs.getString("cnpj"));

                    return Optional.of(fornecedor);
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
