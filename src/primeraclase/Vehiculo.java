package primeraclase;

public abstract class Vehiculo {

    private Integer numeroLlantas;

    public Integer getNumeroLLantas()
    {
        return  numeroLlantas;
    }

    public  Vehiculo(){
        numeroLlantas = 4;
    }

    public void setNumeroLlantas(Integer llantas)
    {
        numeroLlantas= llantas;
    }

    public  abstract  void lavarVehiculo();

}
