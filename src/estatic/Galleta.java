package estatic;

public class Galleta {
    private String sabor;
    private String color;
    private String tamano;
    private String forma;



    public static void setCantidad(int cantidad) {
        Galleta.cantidad = cantidad;
    }

    public static int getCantidad() {
        return cantidad;
    }

    private static int cantidad = 0;

    public Galleta(String sabor, String color, String tamano, String forma) {
        this.sabor = sabor;
        this.color = color;
        this.tamano = tamano;
        this.forma = forma;
        cantidad++;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }

    public String getColor() {
        return color;
    }

    public String getTamano() {
        return tamano;
    }

    public String getForma() {
        return forma;
    }

    @Override
    public String toString() {
        return  sabor+" - "+ color+" - "+tamano+" - "+forma+" - "+cantidad;
    }
}

