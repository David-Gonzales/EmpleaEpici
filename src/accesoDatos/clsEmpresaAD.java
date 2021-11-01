package accesoDatos;

import java.sql.Connection;
import java.sql.Statement;

import clases.clsEmpresa;
import clases.clsPersona;
import clases.clsUsuario;
import java.sql.ResultSet;
import java.util.ArrayList;

public class clsEmpresaAD {

    //registrar una empresa
    public void registrar(clsEmpresa empresa) {
        clsUsuarioAD user = new clsUsuarioAD();
        int idUsuario = user.registrar(empresa.getUsuario());
        clsPersonaAD persona = new clsPersonaAD();
        int idPersona = persona.registrar(empresa.getPersonaContacto());

        Connection cn = null;
        Statement st = null;

        try {
            String sql = "insert into empresa values (null, '" + empresa.getRazonSocial() + "', "
                    + "'" + empresa.getNombreComercial() + "', '" + empresa.getRuc() + "', "
                    + "'" + empresa.getTelefono() + "', " + idUsuario + " , " + idPersona + ");";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate(sql);
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public clsEmpresa obtenerEmpresa(clsUsuario usuario) {
        clsEmpresa empresab = new clsEmpresa();
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            String sql = "select e.razonSocial, e.nombreComercial, e.ruc, "
                    + "e.telefono, p.nombre, p.apellidoPaterno, p.apellidoMaterno "
                    + "from empresa e inner join usuario u "
                    + "on e.idUsuario = u.id inner join persona p on p.id = e.id "
                    + "where u.usuario ='" + usuario.getUsuario() + "'";
            cn = clsConexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                clsPersona personaContacto = new clsPersona(rs.getString(5), rs.getString(6), rs.getString(7));
                clsEmpresa empresa = new clsEmpresa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), usuario, personaContacto);
                empresab = empresa;
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return empresab;
    }

    public ArrayList<Integer> obtenerId(clsUsuario usuario) {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<Integer> listaId = new ArrayList<>();

        try {
            String sql = "select e.id, u.id, p.id"
                    + "	from empresa e"
                    + "	inner join usuario u on e.idUsuario = u.id"
                    + "    inner join persona p on p.id = e.id"
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

    public void actualizarDatos(clsEmpresa empresa) {
        ArrayList<Integer> listaId = obtenerId(empresa.getUsuario());

        clsUsuarioAD usuarioAD = new clsUsuarioAD();
        usuarioAD.actualizar(listaId.get(1), empresa.getUsuario());
        clsPersonaAD personaAD = new clsPersonaAD();
        personaAD.actualizar(listaId.get(2), empresa.getPersonaContacto());

        Connection cn = null;
        Statement st = null;
        String sql = "update empresa set razonSocial = '"+empresa.getRazonSocial()+"', "
                + "nombreComercial = '"+empresa.getNombreComercial()+"', "
                + "ruc = '"+empresa.getRuc()+"' , telefono = '"+empresa.getTelefono()+"'"
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
