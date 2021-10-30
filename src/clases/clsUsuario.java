package clases;

public class clsUsuario {
    private String tipo;
    private String usuario;
    private String clave;

    public clsUsuario() {
    }

    public clsUsuario(String tipo, String usuario, String clave) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
