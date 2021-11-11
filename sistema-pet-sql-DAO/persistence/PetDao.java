package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Pet;

public class PetDao implements IPetDao{

	private static final String URIDB = "jdbc:mariadb://127.0.0.1:3306/bdpet";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public PetDao() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URIDB, USUARIO, PASSWORD);
    }

    @Override
    public void adicionar(Pet pet) {
        try {
            Connection con = getConnection();
            String sql = "INSERT INTO pet (id, nome, raca, peso, nascimento) " +
                    "VALUES (?, ?, ?, ?, ?)";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, pet.getId());
            stmt.setString(2, pet.getNome());
            stmt.setString(3, pet.getRaca());
            stmt.setDouble(4, pet.getPeso());
            stmt.setDate(5, java.sql.Date.valueOf(pet.getDataNascimento()));
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pet> listarPorNome(String nome) {
        List<Pet> lista = new ArrayList<Pet>();
        try {
            Connection con = getConnection();
            String sql = "SELECT * FROM pet WHERE nome like ?";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while( rs.next() ) {
                Pet p = new Pet();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
                p.setRaca(rs.getString("raca"));
                p.setPeso(rs.getDouble("peso"));
                p.setDataNascimento(rs.getDate("nascimento").toLocalDate());
                lista.add(p);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void remover(long id) {
        try {
            Connection con = getConnection();
            String sql = "DELETE FROM pet WHERE id = ?";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, id);
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(long id, Pet pet) {
        try {
            Connection con = getConnection();
            String sql = "UPDATE pet SET nome = ?, raca = ?, peso = ?, nascimento = ? WHERE id = ?";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getRaca());
            stmt.setDouble(3, pet.getPeso());
            stmt.setDate(4, java.sql.Date.valueOf(pet.getDataNascimento()));
            stmt.setLong(5, pet.getId());
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
