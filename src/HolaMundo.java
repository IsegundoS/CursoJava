import estatic.Galleta;
import loops.Loops;
import  primeraclase.Auto;
import primeraclase.MotoCicleta;
import primeraclase.Vehiculo;
import primeraclase.excepciones.PlacaInvalidaException;

import  coleciones.DVD;

public class HolaMundo {
    public static void main(String[] args) throws PlacaInvalidaException {
        //System.out.println("Hola mundo cruel!");
        //Loops loops = new Loops();
        //loops.iterarConFor();

        /**
        // clase auto
        System.out.println("AUTO");
        Auto auto = new Auto();
        System.out.println(auto.getPlaca());
        auto.setNumeroLlantas(4);
        System.out.println(auto.getNumeroLLantas());
        auto.lavarVehiculo();

        // clase moto
        System.out.println("MOTO");
        MotoCicleta moto = new MotoCicleta();
        moto.setNumeroLlantas(2);
        System.out.println( "Numero de Llantas " + moto.getNumeroLLantas().toString());
        moto.lavarVehiculo();

        try {
            Auto auto2 = new Auto("   1234");
            System.out.println(auto2.getPlaca());
        } finally {
            //Liberar recuros
        }

         **/
        //String x1= "Hola Mundo";
        //String x2= "Hola Mundo";

        //System.out.println(x1.equals(x2));

        //Vehiculo vehiculo = new Vehiculo();

        DVD dvd =  new DVD("1", "2","3", "");


        //Galleta galleta =  new Galleta();


        System.out.println(dvd.getGenero());
        System.out.println(dvd.getTitulo());
        System.out.println(dvd.getProtagonista());


    }
}
