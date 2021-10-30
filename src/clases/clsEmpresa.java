package clases;

public class clsEmpresa {
    String razonSocial;
    String nombreComercial;
    String ruc;
    String telefono;
    clsUsuario usuario;
    clsPersona personaContacto;

    public clsEmpresa() {
    }

    public clsEmpresa(String razonSocial, String nombreComercial, String ruc, String telefono, clsUsuario usuario, clsPersona personaContacto) {
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.telefono = telefono;
        this.usuario = usuario;
        this.personaContacto = personaContacto;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public clsUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(clsUsuario usuario) {
        this.usuario = usuario;
    }

    public clsPersona getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(clsPersona personaContacto) {
        this.personaContacto = personaContacto;
    }
    
    
}
