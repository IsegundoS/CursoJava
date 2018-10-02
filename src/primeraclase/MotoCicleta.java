package primeraclase;

public  class MotoCicleta extends Vehiculo {

    private String placa;

    // contructor sin parametros default
    public MotoCicleta() {
        placa = "Desconocido";
    }


    // Getter
    public String getPlaca() {
        return placa;
    }

    // set

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void lavarVehiculo() {
        System.out.println("Lavar a Mano");
    }

}
