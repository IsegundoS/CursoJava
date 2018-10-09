package coleciones;

import java.util.Comparator;

public class OrdenamientoProtagonista implements Comparator<DVD> {
    @Override
    public  int compare(DVD uno, DVD dos) {
        return  uno.getProtagonista().compareTo(dos.getProtagonista());
    }
}
