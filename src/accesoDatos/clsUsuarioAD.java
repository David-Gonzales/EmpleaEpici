package accesoDatos;

import clases.clsUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class clsUsuarioAD {
    
    //Iniciar sesion
    public clsUsuario validar(String usuario, String clave){
        clsUsuario user = new clsUsuario();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from usuario where usuario = '"+usuario+"' and clave = "+clave;
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                clsUsuario user1 = new clsUsuario(rs.getString(2), rs.getString(3), rs.getString(4));
                user = user1;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return user;
    }  
    
}
