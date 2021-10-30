package clases;

public class clsPostulacion {
    private String anuncio;
    private String resultado;
    private int puntaje;
    private int idPostulante;
    private int idAnuncio;

    public clsPostulacion() {
    }

    public clsPostulacion(String anuncio, String resultado, int puntaje, int idPostulante, int idAnuncio) {
        this.anuncio = anuncio;
        this.resultado = resultado;
        this.puntaje = puntaje;
        this.idPostulante = idPostulante;
        this.idAnuncio = idAnuncio;
    }

    public String getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(String anuncio) {
        this.anuncio = anuncio;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
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
