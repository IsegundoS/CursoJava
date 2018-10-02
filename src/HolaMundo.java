import loops.Loops;
import  primeraclase.Auto;
import primeraclase.MotoCicleta;
import primeraclase.Vehiculo;
import primeraclase.excepciones.PlacaInvalidaException;

public class HolaMundo {
    public static void main(String[] args) throws PlacaInvalidaException {
        //System.out.println("Hola mundo cruel!");
        //Loops loops = new Loops();
        //loops.iterarConFor();

        System.out.println("AUTO");
        Auto auto = new Auto();
        System.out.println(auto.getPlaca());
        auto.setNumeroLlantas(4);
        System.out.println(auto.getNumeroLLantas());
        auto.lavarVehiculo();

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

        //Vehiculo vehiculo = new Vehiculo();

    }
}
