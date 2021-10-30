package clases;

public class clsUsuario {
    private String email;
    private String usuario;
    private String clave;

    public clsUsuario() {
    }

    public clsUsuario(String email, String usuario, String clave) {
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
