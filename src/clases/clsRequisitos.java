package clases;

public class clsRequisitos {
    private String requisito;
    private String titulo;
    private int idAnuncio;

    public clsRequisitos() {
    }

    public clsRequisitos(String requisito, String titulo, int idAnuncio) {
        this.requisito = requisito;
        this.titulo = titulo;
        this.idAnuncio = idAnuncio;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }
    
}
