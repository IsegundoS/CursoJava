package Enums;

public enum TamanoCafe {
    ALTO(8),
    GRANDE(10),
    VENTY(16) {
        public String getTipoTapa(){
            return "B";
        }
    },
    MAMALON(25) {
        public String getTipoTapa(){
            return "C";
        }
    };

    private int onzas;

    TamanoCafe(int onzas){
        this.onzas=onzas;
    }

    public int getOnzas() {
        return onzas;
    }

    public  String getTipoTapa(){
        return  "A";
    }
}
