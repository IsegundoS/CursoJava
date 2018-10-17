package Enums;

public class TestCafe {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe();
        cafe1.setTamano(TamanoCafe.VENTY);
        System.out.println(cafe1.getTamano() +" "+cafe1.getTamano().getOnzas() + " "+cafe1.getTamano().getTipoTapa());

        Cafe cafe2 = new Cafe();
        cafe2.setTamano(TamanoCafe.GRANDE);
        System.out.println(cafe2.getTamano()+" "+cafe2.getTamano().getOnzas()+" "+cafe1.getTamano().getTipoTapa());

        Cafe cafe3 = new Cafe();
        cafe3.setTamano(TamanoCafe.MAMALON);
        System.out.println(cafe3.getTamano()+" "+cafe3.getTamano().getOnzas()+" "+cafe1.getTamano().getTipoTapa());

    }


}
