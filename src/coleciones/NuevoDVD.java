package coleciones;
public class NuevoDVD {

    public static void main(String[] args) {
        DVD dvd =  new DVD("Venom", "Comics","Tom Hardy");

        System.out.println("Titulo: "+ dvd.getGenero());
        System.out.println("Genero: "+dvd.getTitulo());
        System.out.println("Protagonista: "+dvd.getProtagonista());

        DVD dvd1 =  new DVD("Avengers", "Ficcion");

        System.out.println("Titulo: "+ dvd.getGenero());
        System.out.println("Genero: "+dvd.getTitulo());
        System.out.println("Protagonista: "+dvd.getProtagonista());


        DVD dvd2 =  new DVD("SpiderMan");

        System.out.println("Titulo: "+ dvd.getGenero());
        System.out.println("Genero: "+dvd.getTitulo());
        System.out.println("Protagonista: "+dvd.getProtagonista());

    }
}



