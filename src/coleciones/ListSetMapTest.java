package coleciones;

import  java.util.*;
import  java.util.Map.Entry;

public class ListSetMapTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Isra");
        lista.add("Dann");
        lista.add("Serch");
        lista.add("Josman");
        lista.add("Gera");

        Set<String>  set = new HashSet<>();
        set.add("Isra");
        set.add("Dann");
        set.add("Serch");
        set.add("Josman");
        set.add("Gera");

        Map<String, String> mapa = new HashMap<>();
        mapa.put("Isra", "Israel Segundo");
        mapa.put("Dann", "Dann Hernandez");
        mapa.put("Serch", "Sergio Rivera");
        mapa.put("Josman", "Jose Manuel Moreno");
        mapa.put("Gera", "Gerardo Rincon");
        mapa.put("Josman", "Jose Manuel Moreno");
        mapa.put("Josman", "Gerardo Rincon");

        System.out.println("Insterando Lista");
        for (String nickname:lista){
            System.out.println(nickname);
        }

        System.out.println("Insterando SET");
        for (String nickname:set){
            System.out.println(nickname);
        }

        System.out.println("Insterando Mapas");
        for (String nickname:mapa.keySet()){
            System.out.println(nickname);
        }

        System.out.println("Insterando Mapas");
        for (Entry<String, String> entry:mapa.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println("MAPA");
        System.out.println(mapa.get("Isra"));
    }
}
