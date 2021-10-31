package accesoDatos;

import clases.clsPersona;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class clsPersonaAD {
    public int registrar(clsPersona persona){
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        int idUsuario = 0;
        
        try {
            String sql = "insert into persona values (null, '"+persona.getNombre()+"', "
                    + "'"+persona.getApellidoPaterno()+"', '"+persona.getApellidoMaterno()+"')";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            sql = "select last_insert_id()";
            rs = st.executeQuery(sql);  
            rs.next();
            idUsuario = rs.getInt(1);
            cn.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return idUsuario;
    }
}
