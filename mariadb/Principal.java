package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	private static final String URLBD = "jdbc:mariadb://127.0.0.1:3306/bdpet";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static void main(String[] args) {
		try{
			System.out.println("Iniciando teste de conex�o com o Banco de Dados");
			
			// Para n�o importar e engessar o c�digo
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Classe carregada.");
			
			// Conex�o do banco
			Connection con = DriverManager.getConnection(URLBD, USER, PASSWORD);
			System.out.println("Conectado ao banco.");
			
			// Roda o comando sql no banco de dados - INSERT
			String sqlAdiciona = "INSERT INTO pet (id, nome, raca, peso, nascimento)\n" +
                    "VALUES (1, 'Lipe', 'Malt�s', 3.0, '2010-12-16');";
			PreparedStatement stmt = con.prepareStatement(sqlAdiciona);
			System.out.println("Quantidade: " + stmt.executeUpdate()); // retorna quantidade de altera��es
			
			// Roda o comando para a busca - SELECT
			String sqlLeitura = "SELECT * FROM pet;";
            PreparedStatement stmt02 = con.prepareStatement(sqlLeitura);
            ResultSet resposta = stmt02.executeQuery();

            while (resposta.next()) {
                System.out.println(resposta.getString("raca"));
            }
			
			con.close(); // fecha a conex�o
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
