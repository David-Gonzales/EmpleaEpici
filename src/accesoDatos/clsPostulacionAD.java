package accesoDatos;

import clases.clsPostulacion;
import clases.clsRespuestas;
import clases.clsUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class clsPostulacionAD {

    public void agregar(clsPostulacion postulacion, ArrayList<clsRespuestas> respuestas, clsUsuario usuario, int fila) throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        int idPostulacion;
        clsPostulanteAD postulanteAD = new clsPostulanteAD();
        int idPostulante = postulanteAD.getId(usuario);
        clsRespuestaAD respuestaAD = new clsRespuestaAD();

        try {
            String sql = "insert into postulacion values(null, '" + postulacion.getResultado() + "', "
                    + idPostulante + "," + fila + ")";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            sql = "select last_insert_id()";
            rs = st.executeQuery(sql);
            rs.next();
            idPostulacion = rs.getInt(1);
            for (clsRespuestas respuesta : respuestas) {
                respuesta.setIdPostulacion(idPostulacion);
                respuestaAD.agregar(respuesta);
            }
            cn.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<String[]> listaPostulantes(int id, clsUsuario usuario) throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String[]> postulaciones = new ArrayList<String[]>();

        clsAnuncioAD anuncioAD = new clsAnuncioAD();
        ArrayList<String[]> listaAnunciosConId = anuncioAD.anunciosConId(usuario);
        int idAnuncio = Integer.parseInt(listaAnunciosConId.get(id - 1)[0]);

        try {
            String sql = "Select pr.nombre, pr.apellidoPaterno, pr.apellidoMaterno, "
                    + "	ps.dni, ps.sexo, ps.celular, p.resultado "
                    + "	from postulacion p inner join postulante ps "
                    + "    on p.idPostulante = ps.id "
                    + "	inner join persona pr "
                    + "    on pr.id = ps.idPersona "
                    + "    where p.idAnuncio = " + idAnuncio;
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String postulante[] = {rs.getString(1), rs.getString(2) + " " + rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                postulaciones.add(postulante);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return postulaciones;
    }

    public ArrayList<String[]> postulaciones(clsUsuario usuario) {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String[]> postulaciones = new ArrayList<String[]>();

        try {
            String sql = "select a.cargo, a.descripcion, e.nombreComercial, po.resultado"
                    + "	from usuario u inner join postulante p on u.id = p.idUsuario"
                    + "    inner join postulacion po on p.id = po.idPostulante "
                    + "    inner join anuncio a on po.idAnuncio = a.id"
                    + "    inner join empresa e on e.id = a.idEmpresa"
                    + "    where u.usuario = '"+usuario.getUsuario()+"'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String postulante[] = {rs.getString(1), rs.getString(2) , rs.getString(3),
                    rs.getString(4)};
                postulaciones.add(postulante);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return postulaciones;
    }
}
