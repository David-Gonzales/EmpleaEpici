package clases;

public class clsRespuestas {
    private String titulo;
    private String respuesta;
    private int idPostulacion;

    public clsRespuestas() {
    }

    public clsRespuestas(String titulo, String respuesta, int idPostulacion) {
        this.titulo = titulo;
        this.respuesta = respuesta;
        this.idPostulacion = idPostulacion;
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

    public int getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(int idPostulacion) {
        this.idPostulacion = idPostulacion;
    } 
}
