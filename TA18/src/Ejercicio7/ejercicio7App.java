package Ejercicio7;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import Connection.ConnectDB;

public class ejercicio7App {
	public void ejercicio7() throws FileNotFoundException, SQLException {
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejercicio7");
		aux.createTable("Ejercicio7","CREATE TABLE CIENTIFICOS (dni VARCHAR(8) PRIMARY KEY, nomapels VARCHAR(255));");
		aux.createTable("Ejercicio7","CREATE TABLE PROYECTOS (id CHAR(4) PRIMARY KEY, nombre VARCHAR(255), horas int);");
		aux.createTable("Ejercicio7","CREATE TABLE ASIGNADO_A (cientifico varchar(8), proyecto char(4), primary key(cientifico,proyecto),"
				+ "FOREIGN KEY(cientifico) REFERENCES CIENTIFICOS(dni) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "FOREIGN KEY(proyecto) REFERENCES PROYECTOS(id) ON DELETE CASCADE ON UPDATE CASCADE);");
		
		
		aux.insertData("Ejercicio7", "INSERT INTO CIENTIFICOS (dni, nomapels) values ('47185264','Dani MS'),('48535478','Jorge TH'),('58996552','Ana JS'),"
				+ "('77588999','David RM'),('87885541','Lola ID') ;");
		
		
		aux.insertData("Ejercicio7", "INSERT INTO PROYECTOS(id,nombre,horas) values ('DEIA','Desarrollo Inteligencia Artificial',50),('MAIA','Manipulacion Inteligencia Artificial',100),"
				+ "('DEAW','Desarrollo Aplicaciones Web',300),('DEAM','Desarrollo Aplicaciones Movil',250),('DEJM','Desarrollo Juegos Multiplataforma',500) ;");
		
		
		aux.insertData("Ejercicio7", "INSERT INTO ASIGNADO_A(cientifico,proyecto) values ('47185264','DEIA'), ('48535478','MAIA'), ('58996552','DEAW'),"
				+ " ('77588999','DEAM'), ('87885541','DEJM');");
		
		
		aux.closeConnection();
	}
}
