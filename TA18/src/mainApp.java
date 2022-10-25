import java.io.FileNotFoundException;
import java.sql.SQLException;
import Connection.ConnectDB;
public class mainApp {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejemplo1");
	}

}
