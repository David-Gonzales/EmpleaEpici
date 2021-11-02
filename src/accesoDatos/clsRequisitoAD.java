package accesoDatos;

import clases.clsRequisitos;
import java.sql.Connection;
import java.sql.Statement;

public class clsRequisitoAD {
    public void agregar(clsRequisitos requisito){
        Connection cn = null;
        Statement st = null;

        try {
            String sql = "insert into requisitos values(null,'"+requisito.getRequisito()+"', "
                    + "'"+requisito.getTitulo()+"',"+ requisito.getIdAnuncio() +")";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
