package accesoDatos;

import clases.clsRequisitos;
import clases.clsRespuestas;
import java.sql.Connection;
import java.sql.Statement;

public class clsRespuestaAD {
    public void agregar(clsRespuestas respuestas){
        Connection cn = null;
        Statement st = null;

        try {
            String sql = "insert into respuestas values(null,'"+respuestas.getTitulo()+"', "
                    + "'"+respuestas.getRespuesta()+"',"+ respuestas.getIdPostulacion()+")";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
