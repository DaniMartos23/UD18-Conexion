package Ejercicio3;
import java.io.FileNotFoundException;
public class Ejer3{
	
	public void ejercicio3() throws FileNotFoundException, SQLException {	
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejer3");
		aux.createTable("Ejer3","CREATE TABLE ALMACENES (Codigo INT PRIMARY KEY, lugar VARCHAR(100), Capacidad INT");
		aux.createTable("Ejer3","CREATE TABLE CAJAS (NumReferencia INT PRIMARY KEY, Contenido VARCHAR(100),Valor INT, Almacen INT, FOREIGN KEY(Almacen) REFERENCES ALMACENES(codigo) ON DELETE CASCADE ON UPDATE CASCADE)");
		
		aux.insertData("Ejer3", "INSERT INTO ALMACENES (Codigo, Lugar, Capacidad ) VALUE(1,'Lerida',500)");
		aux.insertData("Ejer3", "INSERT INTO ALMACENES (Codigo, Nombre) VALUE(2,'barcelona',300)");
		aux.insertData("Ejer3", "INSERT INTO ALMACENES (Codigo, Nombre) VALUE(3,'valencia',500)");
		aux.insertData("Ejer3", "INSERT INTO ALMACENES (Codigo, Nombre) VALUE(4,'Reus',600)");
		aux.insertData("Ejer3", "INSERT INTO ALMACENES (Codigo, Nombre) VALUE(5,'ibague',1000)");
		
		aux.insertData("Ejer3", "INSERT INTO CAJAS (NumReferencia, Contenido, Valor, Almacen) VALUE(1,'portatiles',1000,1)");
		aux.insertData("Ejer3", "INSERT INTO CAJAS (NumReferencia, Contenido, Valor, Almacen) VALUE(2,'monitores',300,2)");
		aux.insertData("Ejer3", "INSERT INTO CAJAS (NumReferencia, Contenido, Valor, Almacen) VALUE(3,'Webcams',100,3)");
		aux.insertData("Ejer3", "INSERT INTO CAJAS (NumReferencia, Contenido, Valor, Almacen) VALUE(4,'sillas',150,4)");
		aux.insertData("Ejer3", "INSERT INTO CAJAS (NumReferencia, Contenido, Valor, Almacen) VALUE(5,'torres',500,5)");
		aux.closeConnection();
	}
}