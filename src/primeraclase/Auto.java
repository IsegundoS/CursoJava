package primeraclase;

import primeraclase.excepciones.PlacaInvalidaException;

public class Auto  extends  Vehiculo {
    private String placa;

    // contructor sin parametros default
    public Auto() {
        placa = "Desconocido";
    }

    // constructor
    public Auto(String placa) throws PlacaInvalidaException {
        placa = placa.trim();
        if (placa.length() == 7 || placa.length() == 8) {
            this.placa = placa;
        } else {
            throw new PlacaInvalidaException("");
        }
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
        System.out.println("Entrando Al car Wash");
    }

}