package coleciones;

import java.util.Comparator;

public class OrdenamientoDirector implements Comparator<DVD> {
    @Override
    public  int compare(DVD uno, DVD dos) {
        return  uno.getDirector().compareTo(dos.getDirector());
    }
}
