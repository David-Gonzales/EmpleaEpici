package clases;

public class clsAnuncio {
    private String descripcion;
    private String cargo;
    private int idEmpresa;

    public clsAnuncio() {
    }

    public clsAnuncio(String descripcion, String cargo, int idEmpresa) {
        this.descripcion = descripcion;
        this.cargo = cargo;
        this.idEmpresa = idEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
    
}
