package Ejercicio4;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import Connection.ConnectDB;
public class Ejercicio4 {
	
	public void ejercicio4() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejercicio4");
		aux.createTable("Ejercicio4","CREATE TABLE PELICULAS (Codigo INT PRIMARY KEY, Nombre CHAR(100), CalificacionEdad INT)");
		aux.createTable("Ejercicio4","CREATE TABLE SALAS (Codigo INT PRIMARY KEY, Nombre CHAR(100), Pelicula INT, FOREIGN KEY(Pelicula) REFERENCES PELICULAS(codigo) ON DELETE CASCADE ON UPDATE CASCADE)");
		aux.insertData("Ejercicio4", "INSERT INTO PELICULAS (Codigo, Nombre, CalificacionEdad) VALUE(1,E.T,3)");
		aux.insertData("Ejercicio4", "INSERT INTO PELICULAS (Codigo, Nombre, CalificacionEdad) VALUE(2,Transformers,7)");
		aux.insertData("Ejercicio4", "INSERT INTO PELICULAS (Codigo, Nombre, CalificacionEdad) VALUE(3,Avatar,12)");
		aux.insertData("Ejercicio4", "INSERT INTO PELICULAS (Codigo, Nombre, CalificacionEdad) VALUE(4,Mulan,3)");
		aux.insertData("Ejercicio4", "INSERT INTO PELICULAS (Codigo, Nombre, CalificacionEdad) VALUE(5,SAW,18)");
		aux.closeConnection();
	}
}
