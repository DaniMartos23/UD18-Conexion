package Ejercicio5;
public class Ejer5{
	
	public void ejercicio5() throws FileNotFoundException, SQLException {	
		ConnectDB aux = new ConnectDB();
		aux.create_connection();
		aux.createDB("Ejer5");
		aux.createTable("Ejer5","CREATE TABLE DIRECTORES (DNI VARCHAR (8) PRIMARY KEY, NomApels NVARCHAR(255),DNIJEFE VARCHAR(8),DESPACHO INT, FOREIGN KEY(dnijefe) REFERENCES DESPACHOS(numero),FOREIGN KEY(despacho) REFERENCES DESPACHOS(numero)ON DELETE CASCADE ON UPDATE CASCADE");
		aux.createTable("Ejer5","CREATE TABLE DESPACHOS (NUMERO INT PRIMARY KEY, CAPACIDAD INT )");
		
		aux.insertData("Ejer5", "INSERT INTO DIRECTORES (DNI, Nombre) VALUE(1DSF,'LeONARDO REYES',3445d,01)");
		aux.insertData("Ejer5", "INSERT INTO DIRECTORES (DNI, Nombre) VALUE(2XVDF,'Hidalgo magallanes',x8852,02)");
		aux.insertData("Ejer5", "INSERT INTO DIRECTORES (DNI, Nombre) VALUE(3SDVF,'Ernesto dela cruz',89552d,03)");
		aux.insertData("Ejer5", "INSERT INTO DIRECTORES (DNI, Nombre) VALUE(4SDF,'Tobias fox',y522fd,04)");
		aux.insertData("Ejer5", "INSERT INTO DIRECTORES (DNI, Nombre) VALUE(5FSDF,'Armando alducin',gg7hds,05)");
		
		aux.insertData("Ejer5", "INSERT INTO DESPACHOS (01, 50, )");
		aux.insertData("Ejer5", "INSERT INTO DESPACHOS (02, 60, )");
		aux.insertData("Ejer5", "INSERT INTO DESPACHOS (03, 50, )");
		aux.insertData("Ejer5", "INSERT INTO DESPACHOS (04, 60, )");
		aux.insertData("Ejer5", "INSERT INTO DESPACHOS (05, 50, )");
		aux.closeConnection();
	}
}
