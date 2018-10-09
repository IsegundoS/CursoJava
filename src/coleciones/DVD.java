package coleciones;

public class DVD implements  Comparable<DVD>{
    private  String titulo;
    private String genero;
    private String protagonista;
    private String director;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
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


    public DVD(String titulo, String genero, String protagonista, String director)
    {
        this (genero, titulo);
        this.protagonista=protagonista;
        this.director = director;
    }

    @Override
    public String toString() {
        return  titulo+" - "+ genero+" - "+protagonista+" - "+director ;
    }


    @Override
    public int compareTo(DVD o) {
        return  titulo.compareTo(o.titulo);
    }
}
