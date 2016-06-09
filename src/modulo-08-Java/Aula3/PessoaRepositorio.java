
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alycio.neto
 */
public class PessoaRepositorio implements IPessoa {
    @Override
    public void insert (Pessoa pessoa){
        final String insert = "INSERT INTO PESSOA(ID_PESSOA, NM_PESSOA)"
            + "VALUES((SELECT MAX(ID_PESSOA) + 1 FROM PESSOA), ?)";
         try (final Connection connection = ConnectionUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(insert); 
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.executeUpdate();
         }catch (SQLException e) {
                System.err.format("SQLException: %s", e);
         }
    }
    @Override
    public void update(Pessoa pessoa){
        final String update = "UPDATE PESSOA SET NM_PESSOA = ? WHERE ID_PESSOA = ?";
        try (final Connection connection = ConnectionUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(update); 
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setLong(2, pessoa.getId());
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
                System.err.format("SQLException: %s", e);
         }
    }
    @Override
    public void delete(Pessoa pessoa){
        final String delete = "DELETE FROM PESSOA WHERE ID_PESSOA = ?";
         try (final Connection connection = ConnectionUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setLong(1, pessoa.getId());
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
                System.err.format("SQLException: %s", e);
         }
    }
    @Override
    public List<Pessoa> listAll(){
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        final String selectAll = "SELECT * FROM PESSOA";
        try (final Connection connection = ConnectionUtils.getConnection()) {
            try (final Statement statement = connection.createStatement()) {
              try (final ResultSet resultSet = statement.executeQuery(selectAll)) {
                  while (resultSet.next()) {
                        listaPessoas.add(new Pessoa(resultSet.getLong("ID_PESSOA"),resultSet.getString("NM_PESSOA")));
                    }
              } catch (final SQLException e) {
                    System.err.format("SQLException: %s", e);
              }
            } catch(final SQLException e){   
                System.err.format("SQLException: %s", e);
            }
        } catch (final SQLException e) {
        System.err.format("SQLException: %s", e);
        }
        return listaPessoas;
    }
    @Override
    public List<Pessoa> findNome(String nome){
         ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        final String selectFiltrado = "SELECT * FROM PESSOA WHERE NM_PESSOA LIKE  ? ";
        try (final Connection connection = ConnectionUtils.getConnection()) {
            try (final PreparedStatement preparedstatement = connection.prepareStatement(selectFiltrado)) {
                preparedstatement.setString(1, "%" + nome + "%");
              try (final ResultSet resultSet = preparedstatement.executeQuery()) {
                  while (resultSet.next()) {
                        listaPessoas.add(new Pessoa(resultSet.getLong("ID_PESSOA"),resultSet.getString("NM_PESSOA")));
                    }
              } catch (final SQLException e) {
                    System.err.format("SQLException: %s", e);
              }
            } catch(final SQLException e){   
                System.err.format("SQLException: %s", e);
            }
        } catch (final SQLException e) {
        System.err.format("SQLException: %s", e);
        }
        return listaPessoas;
    }
}
