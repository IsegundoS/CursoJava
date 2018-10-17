package floatinpoint;

import java.math.BigDecimal;

public class SumaCentavos {
    public static void main(String[] args)  {
        BigDecimal unCetavoBigDecimal = new BigDecimal("0.01");
        unCetavoBigDecimal.add(unCetavoBigDecimal);
        BigDecimal sumaDecimal = unCetavoBigDecimal.add(unCetavoBigDecimal.add(unCetavoBigDecimal.add(unCetavoBigDecimal.add(unCetavoBigDecimal.add(unCetavoBigDecimal)))));
        double unCentavo=.01;
        double suma=unCentavo+unCentavo+unCentavo+unCentavo+unCentavo+unCentavo;
        System.out.println("Suma " +sumaDecimal);

    }
}
