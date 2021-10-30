package clases;

public class clsRespuestas {
    private String titulo;
    private String respuesta;

    public clsRespuestas() {
    }

    public clsRespuestas(String titulo, String respuesta) {
        this.titulo = titulo;
        this.respuesta = respuesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
}
