package Switches;

public class TestSwitch {
    public static void main(String[] args) {
         int x = 8;
         switch (x){
             case 1: System.out.println("x es igual a 1");
             //break;
             case 2: System.out.println("x es igual a 8");
                 //break;
             case 3: System.out.println("x es igual a 3");
                 //break;
             case 4: System.out.println("x es igual a 4");
                 //break;
             case 5: System.out.println("x es igual a 5");
                 //break;
             case 6: System.out.println("x es igual a 6");
                 //break;
             case 7: System.out.println("x es igual a 7");
                 //break;
             case 8: System.out.println("x es igual a 8");
                 //break;
             case 9: System.out.println("x es igual a 9");
                 //break;
             case 10: System.out.println("x es igual a 10");
                 //break;
             default:System.out.println(" No se el valor de X");
         }
         Color color = Color.ROJO;
         switch (color) {
             case ROJO:
                 System.out.println("Color Rojo");
                 break;
             case AMARILLO:
                 System.out.println("Color Amarillo");
                 break;
              default:
                  System.out.println("No se color");
                  break;
         }


    }
}
