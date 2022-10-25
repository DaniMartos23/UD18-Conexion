package Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.swing.JOptionPane;

import com.sun.istack.internal.logging.Logger;

import java.sql.DriverManager;
public class ConnectDB {
	private Connection conexion;
	
	
	public void create_connection() {
		
	}
	
	public void closeConnection() {
		try {
			conexion.close();
			JOptionPane.showMessageDialog(null, "Connection is closed with the server");
		} catch (SQLException ex) {
			Logger.getLogger(ConnectDB.class.getName(), null).log(Level.SEVERE,null,ex);
		}
	}
	
}
