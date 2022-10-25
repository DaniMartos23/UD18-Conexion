package Ejercicio6;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import Connection.ConnectDB;
public class Ejercicio6 {
	
	public void ejercicio6() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		
		aux.createDB("Ejercicio6");
		aux.createTable("Ejercicio6","CREATE TABLE Piezas (Codigo INT PRIMARY KEY, Nombre CHAR(100))");
		aux.createTable("Ejercicio6","CREATE TABLE Proveedores (Id CHAR(4) PRIMARY KEY, Nombre CHAR(100))");
		aux.createTable("Ejercicio6","CREATE TABLE Suministra (CodigoPieza INT, IdProveedor CHAR(4), Precio INT, PRIMARY KEY(CodigoPieza,IdProveedor), FOREIGN KEY(CodigoPieza) REFERENCES Piezas(Codigo) ON DELETE CASCADE ON UPDATE CASCADE,FOREIGN KEY(IdProveedor) REFERENCES Proveedores(Id) ON DELETE CASCADE ON UPDATE CASCADE)");
		
		aux.insertData("Ejercicio6", "INSERT INTO Piezas (Codigo, Nombre) VALUE(1,'Rotor')");
		aux.insertData("Ejercicio6", "INSERT INTO Piezas (Codigo, Nombre) VALUE(2,'Bujia')");
		aux.insertData("Ejercicio6", "INSERT INTO Piezas (Codigo, Nombre) VALUE(3,'Motor')");
		aux.insertData("Ejercicio6", "INSERT INTO Piezas (Codigo, Nombre) VALUE(4,'Llanta')");
		aux.insertData("Ejercicio6", "INSERT INTO Piezas (Codigo, Nombre) VALUE(5,'Limpiaparabrisas')");
		
		aux.insertData("Ejercicio6", "INSERT INTO Proveedores (Id, Nombre) VALUE('BW','BMW')");
		aux.insertData("Ejercicio6", "INSERT INTO Proveedores (Id, Nombre) VALUE('AI','AUDI')");
		aux.insertData("Ejercicio6", "INSERT INTO Proveedores (Id, Nombre) VALUE('VN','VOLSKWAGEN')");
		aux.insertData("Ejercicio6", "INSERT INTO Proveedores (Id, Nombre) VALUE('FI','FERRARI')");
		aux.insertData("Ejercicio6", "INSERT INTO Proveedores (Id, Nombre) VALUE('ST','SEAT')");
		
		aux.insertData("Ejercicio6", "INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUE(1,'BW',59)");
		aux.insertData("Ejercicio6", "INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUE(2,'AI',159)");
		aux.insertData("Ejercicio6", "INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUE(3,'VN',578)");
		aux.insertData("Ejercicio6", "INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUE(4,'FI',80)");
		aux.insertData("Ejercicio6", "INSERT INTO Suministra (CodigoPieza, IdProveedor, Precio) VALUE(5,'ST',20)");
		
		aux.closeConnection();
	}
}
