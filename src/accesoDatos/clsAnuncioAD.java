package accesoDatos;

import clases.clsAnuncio;
import clases.clsRequisitos;
import clases.clsUsuario;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class clsAnuncioAD {

    public void agregar(clsAnuncio anuncio, ArrayList<clsRequisitos> requisitos, clsUsuario usuario) throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        int idAnuncio;
        clsEmpresaAD empresaAD = new clsEmpresaAD();
        int idEmpresa = empresaAD.getId(usuario);
        clsRequisitoAD requisitoAD = new clsRequisitoAD();

        try {
            String sql = "insert into anuncio values(null, '"+anuncio.getDescripcion()+"', "
                    + "'"+anuncio.getCargo()+"'," + idEmpresa + ")";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            sql = "select last_insert_id()";
            rs = st.executeQuery(sql);
            rs.next();
            idAnuncio = rs.getInt(1);

            for (clsRequisitos requisito : requisitos) {
                requisito.setIdAnuncio(idAnuncio);
                requisitoAD.agregar(requisito);
            }

            cn.close();
        } catch (Exception e) {
            throw e;
        }

    }

    public ArrayList<clsAnuncio> anuncios(clsUsuario usuario) throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<clsAnuncio> anuncios = new ArrayList<clsAnuncio>();

        try {
            String sql = "select a.cargo, a.descripcion, a.idEmpresa "
                    + "	from empresa e "
                    + "inner join usuario u on e.idUsuario = u.id "
                    + "    inner join anuncio a on a.idEmpresa = e.id "
                    + "    where u.usuario = '" + usuario.getUsuario() + "'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                clsAnuncio anuncio = new clsAnuncio(rs.getString(2), rs.getString(1), rs.getInt(3));
                anuncios.add(anuncio);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return anuncios;
    }

    public ArrayList<String[]> anunciosConId(clsUsuario usuario) {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String[]> anuncios = new ArrayList<String[]>();

        try {
            String sql = "select a.id, a.cargo, a.descripcion, a.idEmpresa "
                    + "	from empresa e "
                    + "inner join usuario u on e.idUsuario = u.id "
                    + "    inner join anuncio a on a.idEmpresa = e.id "
                    + "    where u.usuario = '" + usuario.getUsuario() + "'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String anuncio[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                anuncios.add(anuncio);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return anuncios;
    }

    public ArrayList<String[]> todosLosAnuncios() throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String[]> anuncios = new ArrayList<String[]>();

        try {
            String sql = "select a.cargo, a.descripcion, e.nombreComercial"
                    + "	from anuncio a inner join empresa e "
                    + "    on a.idEmpresa = e.id";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String anuncio[] = {rs.getString(1), rs.getString(2), rs.getString(3)};
                anuncios.add(anuncio);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return anuncios;
    }

    public ArrayList<String[]> anuncioConRequisitos(int id, clsUsuario usuario) throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        ArrayList<String[]> listaAnunciosConId = anunciosConId(usuario);
        int idAnuncio = Integer.parseInt(listaAnunciosConId.get(id - 1)[0]);

        ArrayList<String[]> anuncios = new ArrayList<String[]>();

        try {
            String sql = "select a.cargo, a.descripcion, r.titulo, r.requisito"
                    + "	from anuncio a inner join requisitos r on (a.id = r.idAnuncio)"
                    + "    where a.id = " + idAnuncio;
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String anuncio[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                anuncios.add(anuncio);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return anuncios;
    }

    public ArrayList<String[]> anuncioConRequisitos(int id) throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String[]> anuncios = new ArrayList<String[]>();

        try {
            String sql = "select a.cargo, a.descripcion, r.titulo, r.requisito"
                    + "	from anuncio a inner join requisitos r on (a.id = r.idAnuncio)"
                    + "    where a.id = " + id;
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String anuncio[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                anuncios.add(anuncio);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return anuncios;
    }
}
