package estatic;



import java.util.ArrayList;
import java.util.List;

public class GalletaTest {

    //Galleta  galleta = new Galleta();



    public static void main(String[] args) {
        List<Galleta> galletas;
        galletas= llenarGalleta();

        for (Galleta list:galletas) {
            System.out.println(list);
        }

        //DVD dvd = new DVD("");
    }

    private static List<Galleta> llenarGalleta(){
        Galleta galleta1 = new Galleta("Chocolate", "Blanco", "Grande", "Circular");
        Galleta galleta2 = new Galleta("Maple", "Cafe", "Grande", "Circular");
        Galleta galleta3 = new Galleta("Canela", "Blanco", "Mediano", "Triangular");
        Galleta galleta4 = new Galleta("Chocolate  Blanco", "Blanco", "Grande", "Cuadrada");
        Galleta galleta5 = new Galleta("Vainilla", "Blanco", "Grande", "Circular");
        Galleta galleta6 = new Galleta("Fresa", "Blanco", "Grande", "Triangular");
        Galleta galleta7 = new Galleta("Cereza", "Blanco", "Grande", "Circular");
        Galleta galleta8 = new Galleta("Chocolate con Fresa", "Blanco", "Triangular", "Circular");
        Galleta galleta9 = new Galleta("Fresa", "Blanco", "Grande", "Circular");
        Galleta galleta10 = new Galleta("Chocolate", "Blanco", "Grande", "Circular");
        Galleta galleta11 = new Galleta("Chocolate Blanco", "Blanco", "Grande", "Circular");
        Galleta galleta12 = new Galleta("Canela", "Blanco", "Grande", "Circular");
        Galleta galleta13 = new Galleta("Chocolate", "Blanco", "Grande", "Circular");
        Galleta galleta14 = new Galleta("Maple", "Blanco", "Grande", "Cuadrada");
        Galleta galleta15 = new Galleta("Fresa", "Blanco", "Grande", "Circular");
        List<Galleta> listaGalleta = new ArrayList<>();
        listaGalleta.add(galleta1);
        listaGalleta.add(galleta2);
        listaGalleta.add(galleta13);
        listaGalleta.add(galleta4);
        listaGalleta.add(galleta5);
        listaGalleta.add(galleta6);
        listaGalleta.add(galleta7);
        listaGalleta.add(galleta8);
        listaGalleta.add(galleta9);
        listaGalleta.add(galleta10);
        listaGalleta.add(galleta11);
        listaGalleta.add(galleta12);
        listaGalleta.add(galleta13);
        listaGalleta.add(galleta14);
        listaGalleta.add(galleta15);
        return  listaGalleta;

    }
}
