package accesoDatos;

import clases.clsPostulante;
import java.sql.Connection;
import java.sql.Statement;

public class clsPostulanteAD {
    public void registrar(clsPostulante postulante){
        clsUsuarioAD user = new clsUsuarioAD();
        int idUsuario = user.registrar(postulante.getUsuario());
        clsPersonaAD persona = new clsPersonaAD();
        int idPersona = persona.registrar(postulante.getPersona());

        Connection cn = null;
        Statement st = null;

        try {
            String sql = "insert into postulante values (null, '" + postulante.getFechaNacimiento() + "', "
                    + "'" + postulante.getDni() + "', '" + postulante.getCelular() + "', '" + postulante.getSexo() + "', " + idUsuario + " , " + idPersona + ");";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
