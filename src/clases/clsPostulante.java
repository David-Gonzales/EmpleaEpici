package clases;

public class clsPostulante extends clsPersona {
    private String fechaNacimiento;
    private String celular;
    private String dni;
    private clsUsuario usuario;

    public clsPostulante() {
    }

    public clsPostulante(String fechaNacimiento, String celular, String dni, clsUsuario usuario) {
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.dni = dni;
        this.usuario = usuario;
    }

    public clsPostulante(String fechaNacimiento, String celular, String dni, clsUsuario usuario, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.dni = dni;
        this.usuario = usuario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public clsUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(clsUsuario usuario) {
        this.usuario = usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
