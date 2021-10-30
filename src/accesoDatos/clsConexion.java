package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class clsConexion {
    public static Connection getConexion() throws Exception{
        Connection cn = null;
        String rutaBD = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            rutaBD = "jdbc:mysql://localhost:3306/emplea_epici?autoReconnect=true";
            cn = DriverManager.getConnection(rutaBD, "root", "");
        } catch (Exception e) {
            throw e;
        }
        return cn;
    }
}
