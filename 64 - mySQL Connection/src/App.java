import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//Create DB, Table, Record using PHPmyAdmin
//Download the JDBC Connector
//Otworzyæ projekt, dodaæ pobrany .jar (JDBC connector) do JRE 
//BuildPath --> Configure BuildPath --> AddJAR's

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Accessing driver from the JAR file
		Class.forName("com.mysql.jdbc.Driver");
		// Tworzenie zmiennej dla po³¹czenia "con
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/testbd", "root", "pass");
		//jdbc:mysql://localhost:3306/testbd - Baza danych
		//root - u¿ytkownik
		//pass - has³o
		
		//Zapytanie
		PreparedStatement statment = con.prepareStatement("Select * from name");
		// Tworzenie zmiennej wykonuj¹cej zapytanie
		ResultSet result = statment.executeQuery();
		//wypisywanie jak z pliku
		while(result.next()){
			System.out.println(result.getString(1)+result.getString(2));
			//getString zwraca dane
			//1 - pierwsza kolumna
			//2 - druga kolumna
		}
	}
}
