package coleciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static sun.rmi.transport.TransportConstants.Return;

public class EjercicioDvd {
    public static void main(String[] args) {
        List<DVD>  dvd;
        dvd=llenarLista();



        for (DVD list:dvd) {
            System.out.println(list.toString());
        }

        System.out.println(" Ordenamiento Titulo///////////////////////////////");

        Collections.sort(dvd);
        for (DVD list:dvd) {
            System.out.println(list.toString());
        }

        System.out.println(" Ordenamiento Genero///////////////////////////////");
        OrdenamientoGenero ordenGenero = new OrdenamientoGenero();

        Collections.sort(dvd, ordenGenero);
        for (DVD list:dvd) {
            System.out.println(list.toString());
        }

        System.out.println("Ordenamiento Protagonista///////////////////////////////");
        OrdenamientoProtagonista ordenProtagonista = new OrdenamientoProtagonista();

        Collections.sort(dvd, ordenProtagonista);
        for (DVD list:dvd) {
            System.out.println(list);
        }

        System.out.println("Orden Director ///////////////////////////////");
        OrdenamientoDirector ordenDirector = new OrdenamientoDirector();

        Collections.sort(dvd, ordenDirector);
        for (DVD list:dvd) {
            System.out.println(list);
        }

    }

    private static List<DVD> llenarLista(){

        DVD dvd1 =  new DVD("Advergers", "Comics","Robert Downey Jr", "Joss Whedon");
        DVD dvd2 =  new DVD("IronMan", "Comics","Robert Downey Jr", "Jon Favreau");
        DVD dvd3 =  new DVD("Infinity War", "Comics","Tom Hollan", "Hermanos Russo");
        DVD dvd4 =  new DVD("SpiderMan: Homecoming", "Comics","Tom Hollan", "Jon Watts");
        DVD dvd5 =  new DVD("Pantera Negra", "Comics","Chadwin Boseman", "Ryan Coogler");
        DVD dvd6 =  new DVD("Guardianes de la Galaxia", "Comics","Chris Pratt", "James Gunn");
        DVD dvd7=  new DVD("La Era de Ultron", "Comics","Scalett Johanson", "Joss Whedon");
        DVD dvd8 =  new DVD("Civil War", "Comics","Chris Evans", "Hermanos Russo");
        DVD dvd9 =  new DVD("Ant Man and The Wasp", "Comics","Evangeline Lily", "Peyton Reed");
        DVD dvd10 =  new DVD("Doctor Strange", "Comics","Benedict Cumberbatch", "Scott Derrickson");

        List<DVD> listaDVD = new ArrayList<>();
        listaDVD.add(dvd1);
        listaDVD.add(dvd2);
        listaDVD.add(dvd3);
        listaDVD.add(dvd4);
        listaDVD.add(dvd5);
        listaDVD.add(dvd6);
        listaDVD.add(dvd7);
        listaDVD.add(dvd8);
        listaDVD.add(dvd9);
        listaDVD.add(dvd10);

        //System.out.println("Insterando DVD");
         //for (DVD dvdName:listaDVD){
           // System.out.println(dvdName.getTitulo());
        //}

        return listaDVD;

    }


}
