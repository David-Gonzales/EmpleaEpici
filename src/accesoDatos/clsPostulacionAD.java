package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class clsPostulacionAD {

    public ArrayList<String[]> listaPostulantes(int id) throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String[]> postulaciones = new ArrayList<String[]>();

        try {
            String sql = "Select pr.nombre, pr.apellidoPaterno, pr.apellidoMaterno, "
                    + "	ps.dni, ps.sexo, ps.celular, p.puntaje, p.resultado "
                    + "	from postulacion p inner join postulante ps "
                    + "    on p.idPostulante = ps.id "
                    + "	inner join persona pr "
                    + "    on pr.id = ps.idPersona "
                    + "    where p.idAnuncio = " + id;
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String postulante[] = {rs.getString(1), rs.getString(2) + " " + rs.getString(3), 
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8) };
                postulaciones.add(postulante);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return postulaciones;
    }
}
