package Ejercicio2;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import Connection.ConnectDB;

public class ejercicio2App {

	public void ejercicio2() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejercicio2");
		
		aux.createTable("Ejercicio2","CREATE TABLE DEPARTAMENTOS (codigo INT PRIMARY KEY, nombre varchar(100), presupuesto int);");
		aux.createTable("Ejercicio2","CREATE TABLE EMPLEADOS (dni varchar(8), nombre varchar(100),apellidos varchar(255), departamento int,"
				+ "FOREIGN KEY(departamento) REFERENCES DEPARTAMENTOS(codigo) ON DELETE CASCADE ON UPDATE CASCADE);");
		
		
		aux.insertData("Ejercicio2", "INSERT INTO DEPARTAMENTOS (codigo, nombre, prespuesto) values (1,'DEPT_1',200),(2,'DEPT_2',400),(3,'DEPT_3',600),(4,'DEPT_4',800),"
				+ "(5,'DEPT_5',1000);");
		
		
		aux.insertData("Ejercicio2", "INSERT INTO EMPLEADOS(dni,nombre,apellidos,departamento) values ('47185264','Dani','MS',1),"
				+ "('48535478','Jorge','TH',2),('58996552','Ana','JS',3),('77588999','David','RM',4),('87885541','Lola','ID',5);");
		
		
		aux.closeConnection();
	}
}
