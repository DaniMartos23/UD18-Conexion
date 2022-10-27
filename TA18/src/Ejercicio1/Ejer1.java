package Ejercicio1;
import java.io.FileNotFoundException;
public class Ejer1{
	
	public void ejercicio4() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejer1");
		aux.createTable("Ejer1","CREATE TABLE FABRICANTES (Codigo INT PRIMARY KEY, Nombre CHAR(100)");
		aux.createTable("Ejer1","CREATE TABLE ARTICULOS (Codigo INT PRIMARY KEY, Nombre CHAR(100),Precio int, Fabricante INT, FOREIGN KEY(Fabricante) REFERENCES FABRICANTES(codigo) ON DELETE CASCADE ON UPDATE CASCADE)");
		
		aux.insertData("Ejer1", "INSERT INTO FABRICANTES (Codigo, Nombre) VALUE(1,'Lenovo')");
		aux.insertData("Ejer1", "INSERT INTO FABRICANTES (Codigo, Nombre) VALUE(2,'hp')");
		aux.insertData("Ejer1", "INSERT INTO FABRICANTES (Codigo, Nombre) VALUE(3,'Dell')");
		aux.insertData("Ejer1", "INSERT INTO FABRICANTES (Codigo, Nombre) VALUE(4,'Toshiba')");
		aux.insertData("Ejer1", "INSERT INTO FABRICANTES (Codigo, Nombre) VALUE(5,'Acer')");
		
		aux.insertData("Ejer1", "INSERT INTO ARTICULOS (Codigo, Nombre, Precio, Fabricante) VALUE(1,'portatil',1000,'Lenovo')");
		aux.insertData("Ejer1", "INSERT INTO ARTICULOS (Codigo, Nombre, Precio, Fabricante) VALUE(2,'monitor',300,'hp')");
		aux.insertData("Ejer1", "INSERT INTO ARTICULOS (Codigo, Nombre, Precio, Fabricante) VALUE(3,'Webcam',100,'dell')");
		aux.insertData("Ejer1", "INSERT INTO ARTICULOS (Codigo, Nombre, Precio, Fabricante) VALUE(4,'silla',150,'acer')");
		aux.insertData("Ejer1", "INSERT INTO ARTICULOS (Codigo, Nombre, Precio, Fabricante) VALUE(5,'torre',500,'Toshina')");
		aux.closeConnection();
	}
}
