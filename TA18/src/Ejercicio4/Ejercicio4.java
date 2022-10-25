package Ejercicio4;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import Connection.ConnectDB;
public class Ejercicio4 {
	
	public void ejercicio4() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejercicio4");
		aux.createTable("Ejercicio4","CREATE TABLE PELICULAS Codigo INT PRIMARY KEY, Nombre CHAR(100), CalificacionEdad INT");
		aux.createTable("Ejercicio4","CREATE TABLE SALAS Codigo INT PRIMARY KEY, Nombre CHAR(100), Pelicula INT, FOREIGN KEY(Pelicula) REFERENCES Peliculas(codigo) ON DELETE CASCADE ON UPDATE CASCADE");
		aux.closeConnection();
	}
}
