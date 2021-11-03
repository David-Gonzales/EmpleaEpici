package clases;

public class clsPostulacion {
    private String resultado;
    private int idPostulante;
    private int idAnuncio;

    public clsPostulacion() {
    }

    public clsPostulacion(String resultado, int idPostulante, int idAnuncio) {
        this.resultado = resultado;
        this.idPostulante = idPostulante;
        this.idAnuncio = idAnuncio;
    }

    public clsPostulacion(String resultado) {
        this.resultado = resultado;
    }
    
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(int idPostulante) {
        this.idPostulante = idPostulante;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }
    
    
}
