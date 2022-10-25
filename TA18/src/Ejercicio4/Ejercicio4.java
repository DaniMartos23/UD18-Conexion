package Ejercicio4;
import java.io.FileNotFoundException;

import Connection.ConnectDB;
public class Ejercicio4 {
	
	public void ejercicio4() throws FileNotFoundException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejercicio4");
	}
}
