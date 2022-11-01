import java.io.FileNotFoundException;
import java.sql.SQLException;
import Connection.ConnectDB;
import Ejercicio1.Ejer1;
import Ejercicio2.ejercicio2App;
import Ejercicio3.Ejer3;
import Ejercicio4.Ejercicio4;
import Ejercicio5.Ejer5;
import Ejercicio6.Ejercicio6;
import Ejercicio7.ejercicio7App;
import Ejercicio8.Ejercicio8;
import Ejercicio9.ejercicio9App;
public class mainApp {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		Ejer1 aux1 = new Ejer1();
		aux1.ejercicio1();
		
		ejercicio2App aux2= new ejercicio2App();
		aux2.ejercicio2();
		
		Ejer3 aux3= new Ejer3();
		aux3.ejercicio3();
		
		Ejercicio4 aux4 = new Ejercicio4();
		aux4.ejercicio4();
		
		Ejer5 aux5 = new Ejer5();
		aux5.ejercicio5();
		
		Ejercicio6 aux6 = new Ejercicio6();
		aux6.ejercicio6();
		
		ejercicio7App aux7= new ejercicio7App();
		aux7.ejercicio7();
		
		Ejercicio8 aux8 = new Ejercicio8();
		aux8.ejercicio8();
		
		ejercicio9App aux9= new ejercicio9App();
		aux9.ejercicio9();
		
	}

}
