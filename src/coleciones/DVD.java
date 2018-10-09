package coleciones;

public class DVD {
    private  String titulo;
    private String genero;
    private String protagonista;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public DVD(String titulo)
    {
        this.titulo = titulo;
    }

    public DVD(String genero, String titulo)
    {
        this (titulo);
        this.genero=genero;
    }


    public DVD(String titulo, String genero, String protagonista)
    {
        this (genero, titulo);
        this.protagonista=protagonista;
    }
}
