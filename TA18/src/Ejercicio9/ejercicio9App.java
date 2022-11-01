package Ejercicio9;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import Connection.ConnectDB;

public class ejercicio9App {
	public static void ejecutaEjercicio() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejercicio9");
		aux.createTable("Ejercicio9","CREATE TABLE FACULTAD (codigo int PRIMARY KEY, nombre VARCHAR(100));");
		aux.createTable("Ejercicio9","CREATE TABLE INVESTIGADORES (dni VARCHAR(8) PRIMARY KEY, nomapels VARCHAR(255),facultad int, "
				+ "FOREIGN KEY(facultad) REFERENCES FACULTAD(codigo) ON DELETE CASCADE ON UPDATE CASCADE);");
		aux.createTable("Ejercicio9","CREATE TABLE EQUIPOS (numserie CHAR(4) PRIMARY KEY, nombre VARCHAR(100),facultad int, "
				+ "FOREIGN KEY(facultad) REFERENCES FACULTAD(codigo) ON DELETE CASCADE ON UPDATE CASCADE);");
		
		
		aux.insertData("Ejercicio9", "INSERT INTO DEPARTAMENTOS (codigo, nombre, prespuesto) values (1,'DEPT_1',200),(2,'DEPT_2',400),(3,'DEPT_3',600),(4,'DEPT_4',800),"
				+ "(5,'DEPT_5',1000)");
		
		
		aux.insertData("Ejercicio9", "INSERT INTO EMPLEADOS(dni,nombre,apellidos,departamento) values ('47185264','Dani','MS',1),"
				+ "('48535478','Jorge','TH',2),('58996552','Ana','JS',3),('77588999','David','RM',4),('87885541','Lola','ID',5)");
		
		
		aux.closeConnection();
	}
}
