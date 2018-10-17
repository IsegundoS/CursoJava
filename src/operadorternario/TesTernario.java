package operadorternario;

public class TesTernario {
    public static void main(String[] args)  {
        validarAcceso(1,2,34,45,67,78,33,11,34,5,35,55,7);
    }

    private static void validarAcceso(int... x){
        for (int i: x){
            //if (i > 18){
              //  System.out.println("Aprobado");
            //}else{
              //  System.out.println("Denegado");
            String status = (i > 18) ? "Aprobado" : "Denegado";
            System.out.println(status);
            }
        }


}
