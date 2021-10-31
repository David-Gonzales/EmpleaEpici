package accesoDatos;

import java.sql.Connection;
import java.sql.Statement;

import clases.clsEmpresa;

public class clsEmpresaAD {
    //registrar una empresa
    public void registrar(clsEmpresa empresa){
        
        clsUsuarioAD user = new clsUsuarioAD();
        int idUsuario = user.registrar(empresa.getUsuario());
        clsPersonaAD persona = new clsPersonaAD();
        int idPersona = persona.registrar(empresa.getPersonaContacto());
        
        Connection cn = null;
        Statement st = null;

        try {
            String sql = "insert into empresa values (null, '"+empresa.getRazonSocial()+"', "
                    + "'"+empresa.getNombreComercial()+"', '"+empresa.getRuc()+"', '"+empresa.getTelefono()+"', "+idUsuario+" , "+idPersona+");";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
