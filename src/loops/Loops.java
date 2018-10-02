package loops;

import java.util.ArrayList;

public class Loops {
    // Interacion con For norma
    public  void iterarConFor(){
        for (int i=0; i<10; i++){
            System.out.println("Dentro de Ciclo Con For "+i);
        }

        // Interacion con For EACH

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer numero: numeros){
            System.out.println("Dentro de FOREACH "+ numero);
        }

        // Interacion con WHILE

        int x = 0;
        while (x<5){
            System.out.println("Dentro de Ciclo de While " + ++x);
            //x++;
        }

        // Interacion con DoWHILE

        do{
            System.out.println("Dentro de Ciclo de DoWhile " + x++);
        }while (x == 0);


    }


}
