package Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.JOptionPane;

import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
	
public class ConnectDB {
		
	private Connection connect;
		
		
		public void create_connection() {
			
		}
		
		public void closeConnection() {
			try {
				connect.close();
				JOptionPane.showMessageDialog(null, "Connection is closed with the server");
			} catch (SQLException ex) {
				Logger.getLogger(ConnectDB.class.getName(), null).log(Level.SEVERE,null,ex);
			}
		}
		
		public void createDB(String name) {
			try {
				String Query = "CREATE DATABASE " + name;
				Statement st = connect.createStatement();
				st.executeUpdate(Query);
				closeConnection();
				//AQUI LLAMAMOS A LA FUNCION DE CONEXION
				JOptionPane.showMessageDialog(null," Created database " + name + "successfully ");
			} catch (SQLException ex) {
				Logger.getLogger(ConnectDB.class.getName(), null).log(Level.SEVERE,null,ex);
			}
		}
		
		
		
	}
