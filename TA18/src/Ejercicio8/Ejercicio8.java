package Ejercicio7;
package Ejercicio8;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import Connection.ConnectDB;
public class Ejercicio8 {
	
	public void ejercicio8() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		
		aux.createDB("Ejercicio8");
		aux.createTable("Ejercicio8","CREATE TABLE Cajeros (Codigo INT PRIMARY KEY, NomApels CHAR(255))");
		aux.createTable("Ejercicio8","CREATE TABLE Productos (Codigo INT PRIMARY KEY, Nombre CHAR(100), Precio INT)");
		aux.createTable("Ejercicio8","CREATE TABLE Maquinas_Registradoras (Codigo INT PRIMARY KEY, Piso INT)");
		aux.createTable("Ejercicio8","CREATE TABLE Venta (Cajero INT, Maquina INT, Producto INT, PRIMARY KEY(Cajero,Maquina,Producto), FOREIGN KEY (Cajero) REFERENCES Cajeros(Codigo) ON DELETE CASCADE ON UPDATE CASCADE," + 
				" FOREIGN KEY (Maquina) REFERENCES Maquinas_Registradoras(Codigo) ON DELETE CASCADE ON UPDATE CASCADE," + 
				" FOREIGN KEY (Producto) REFERENCES Productos(Codigo) ON DELETE CASCADE ON UPDATE CASCADE)");
		
		
		aux.insertData("Ejercicio8", "INSERT INTO Cajeros (Codigo, NomApels) VALUE(1,'Consolacion Salazar')");
		aux.insertData("Ejercicio8", "INSERT INTO Cajeros (Codigo, NomApels) VALUE(2,'Guillermo Ramos')");
		aux.insertData("Ejercicio8", "INSERT INTO Cajeros (Codigo, NomApels) VALUE(3,'Ikram Alarcon')");
		aux.insertData("Ejercicio8", "INSERT INTO Cajeros (Codigo, NomApels) VALUE(4,'Fabio Merchan')");
		aux.insertData("Ejercicio8", "INSERT INTO Cajeros (Codigo, NomApels) VALUE(5,'Mauricio Rubio')");
		
		aux.insertData("Ejercicio8", "INSERT INTO Productos (Codigo, Precio, Nombre) VALUE(1,'3.99','Ropa')");
		aux.insertData("Ejercicio8", "INSERT INTO Productos (Codigo, Precio, Nombre) VALUE(2,'0.99','Chicle')");
		aux.insertData("Ejercicio8", "INSERT INTO Productos (Codigo, Precio, Nombre) VALUE(3,'38.99','Estufa')");
		aux.insertData("Ejercicio8", "INSERT INTO Productos (Codigo, Precio, Nombre) VALUE(4,'12.65','Manta')");
		aux.insertData("Ejercicio8", "INSERT INTO Productos (Codigo, Precio, Nombre) VALUE(5,'2.99','Pescado')");
		
		aux.insertData("Ejercicio8", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUE(1,1)");
		aux.insertData("Ejercicio8", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUE(2,1)");
		aux.insertData("Ejercicio8", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUE(3,1)");
		aux.insertData("Ejercicio8", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUE(4,2)");
		aux.insertData("Ejercicio8", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUE(5,2)");
		
		aux.insertData("Ejercicio8", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUE(1,1,1)");
		aux.insertData("Ejercicio8", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUE(1,1,2)");
		aux.insertData("Ejercicio8", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUE(2,2,3)");
		aux.insertData("Ejercicio8", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUE(2,2,4)");
		aux.insertData("Ejercicio8", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUE(3,4,5)");
		
		aux.closeConnection();
	}
}
