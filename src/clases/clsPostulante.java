package clases;

public class clsPostulante{
    private String fechaNacimiento;
    private String celular;
    private String dni;
    private String sexo;
    private clsPersona persona;
    private clsUsuario usuario;

    public clsPostulante() {
    }

    public clsPostulante(String fechaNacimiento, String celular, String dni, String sexo, clsPersona persona, clsUsuario usuario) {
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.dni = dni;
        this.sexo = sexo;
        this.persona = persona;
        this.usuario = usuario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public clsPersona getPersona() {
        return persona;
    }

    public void setPersona(clsPersona persona) {
        this.persona = persona;
    }

    public clsUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(clsUsuario usuario) {
        this.usuario = usuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  }
