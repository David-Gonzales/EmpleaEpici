package accesoDatos;

import clases.clsPersona;
import clases.clsPostulante;
import clases.clsUsuario;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
    
    public clsPostulante obtenerPostulante(clsUsuario usuario) {
        clsPostulante postulante1 = new clsPostulante();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            String sql = "select po.fechaNacimiento, po.celular, po.dni, "
                    + "po.sexo, p.nombre, p.apellidoPaterno, p.apellidoMaterno "
                    + "from postulante po inner join usuario u "
                    + "on po.idUsuario = u.id inner join persona p on p.id = po.id "
                    + "where u.usuario ='" + usuario.getUsuario() + "'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                clsPersona persona = new clsPersona(rs.getString(5), rs.getString(6), rs.getString(7));
                clsPostulante postulante = new clsPostulante(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), persona , usuario);
                postulante1 = postulante;
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return postulante1;
    }
    
    public ArrayList<Integer> obtenerId(clsUsuario usuario) {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Integer> listaId = new ArrayList<>();

        try {
            String sql = "select po.id, u.id, p.id"
                    + "	from postulante po"
                    + "	inner join usuario u on po.idUsuario = u.id"
                    + "    inner join persona p on p.id = po.id"
                    + "    where u.usuario = '" + usuario.getUsuario() + "'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                listaId.add(rs.getInt(1));
                listaId.add(rs.getInt(2));
                listaId.add(rs.getInt(3));
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return listaId;
    }
    
    public void actualizarDatos(clsPostulante postulante) {
        ArrayList<Integer> listaId = obtenerId(postulante.getUsuario());

        clsUsuarioAD usuarioAD = new clsUsuarioAD();
        usuarioAD.actualizar(listaId.get(1), postulante.getUsuario());
        clsPersonaAD personaAD = new clsPersonaAD();
        personaAD.actualizar(listaId.get(2), postulante.getPersona());

        Connection cn = null;
        Statement st = null;
        String sql = "update postulante set fechaNacimiento = '"+postulante.getFechaNacimiento()+"', "
                + "celular = '"+postulante.getCelular()+"', "
                + "dni = '"+postulante.getDni()+"' , sexo = '"+postulante.getSexo()+"'"
                + "where id = " + listaId.get(0);
        try {
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            cn.close();
        } catch (Exception e) {
        }
    }
}
