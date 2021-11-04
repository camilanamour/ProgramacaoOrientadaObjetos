package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entity.Pet;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PetController {
	
	private static final String URLBD = "jdbc:mariadb://127.0.0.1:3306/bdpet";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	
//  Propriedade para cada elemento
	public LongProperty id = new SimpleLongProperty(0);
    public StringProperty nome = new SimpleStringProperty("");
    public StringProperty raca = new SimpleStringProperty("");
    public DoubleProperty peso = new SimpleDoubleProperty(0);
    public ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<LocalDate>(LocalDate.now());
	
    private static long counter = 0;
    
	private List<Pet> PetsGeral = new ArrayList<Pet>();
    private ObservableList<Pet> listaPets = FXCollections.observableArrayList();
	
    public PetController() {
    	try{
			Class.forName("org.mariadb.jdbc.Driver");			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
    
    public Connection getConnection() throws SQLException{
    	return DriverManager.getConnection(URLBD, USUARIO, SENHA);
    }
    
    public void adicionar() {
      Pet p = new Pet();
      p.setId(++counter);
      fromEntity(p);
  }
	
	public void pesquisar(){
		listaPets.clear();
		try {
            Connection con = getConnection();
            String sql = "SELECT * FROM pet WHERE nome like '%" + nome.get() + "%'";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while( rs.next() ) {
                Pet p = new Pet();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
                p.setRaca(rs.getString("raca"));
                p.setPeso(rs.getDouble("peso"));
                p.setDataNascimento(rs.getDate("nascimento").toLocalDate());
                listaPets.add(p);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (!listaPets.isEmpty()) {
            fromEntity(listaPets.get(0));
        }
    }

    public void alterar() {
        Pet pet = toEntity();

        try {
            Connection con = getConnection();
            String sql = String.format(Locale.ROOT, "INSERT INTO pet (id, nome, raca, peso, nascimento) " +
                    "VALUES (%d, '%s', '%s', %f, '%s')",
                    pet.getId(),
                    pet.getNome(),
                    pet.getRaca(),
                    pet.getPeso(),
                    pet.getDataNascimento());
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public Pet toEntity() {
        Pet p = new Pet();
        p.setId(id.get());
        p.setNome(nome.get());
        p.setRaca(raca.get());
        p.setPeso(peso.get());
        p.setDataNascimento((LocalDate) nascimento.get());
        return p;
    }

    public void fromEntity(Pet p) {
        id.set(p.getId());
        nome.set(p.getNome());
        raca.set(p.getRaca());
        peso.set(p.getPeso());
        nascimento.set(p.getDataNascimento());
    }
    
    public ObservableList<Pet> getLista(){
    	return listaPets;
    }
    
}
