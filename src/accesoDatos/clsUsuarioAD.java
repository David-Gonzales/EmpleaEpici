package accesoDatos;

import clases.clsUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class clsUsuarioAD {

    public int registrar(clsUsuario usuario) {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        int idUsuario = 0;

        try {
            String sql = "insert into usuario values (null, '" + usuario.getTipo()
                    + "', '" + usuario.getUsuario() + "', '" + usuario.getClave() + "')";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            sql = "select last_insert_id()";
            rs = st.executeQuery(sql);
            rs.next();
            idUsuario = rs.getInt(1);
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return idUsuario;
    }

    //Iniciar sesion
    public clsUsuario validar(String usuario, String clave) {
        clsUsuario user = new clsUsuario();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            String sql = "select * from usuario where usuario = '" + usuario + "' and clave = '"+clave+"'";
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

    public void actualizar(int id, clsUsuario usuario) {
        Connection cn = null;
        Statement st = null;
        String sql = "update usuario set clave = '"+usuario.getClave()+"'"
                       + "where id = " + id;

        try {
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            cn.close();
        } catch (Exception e) {
        }
    }
    
    public boolean existeUsuario(String usuario){
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String nombreUsuario = "";
        
        try {
            String sql = "select usuario from usuario where usuario = '"+usuario+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                nombreUsuario = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
        return !nombreUsuario.isEmpty();
    }
}
