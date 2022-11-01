import java.io.FileNotFoundException;
import java.sql.SQLException;
import Connection.ConnectDB;
import Ejercicio4.Ejercicio4;
import Ejercicio6.Ejercicio6;
import Ejercicio8.Ejercicio8;
public class mainApp {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		Ejercicio4 aux = new Ejercicio4();
		aux.ejercicio4();
		
		Ejercicio6 aux1 = new Ejercicio6();
		aux1.ejercicio6();
		
		Ejercicio8 aux2 = new Ejercicio8();
		aux2.ejercicio8();
		
	}

}
