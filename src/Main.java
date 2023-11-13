import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class Main {
    public static void main(String[] args) {
    Articolo articolo1 = new Articolo("pizza",1.5);
    Articolo articolo2 = new Articolo("coco cola",0.5);
    Articolo articolo3 = new Articolo("crostata",1.0);
    //1 metodo
    Map<String,Articolo> mappaCat = new HashMap<>();
        mappaCat.put("cibo",articolo1);
        mappaCat.put("bevanda",articolo2);
        mappaCat.put("dolce",articolo3);
        System.out.println(mappaCat);
    // 2 metodo
        Map<String,Articolo> mappaCat2 = Map.of("cibo",articolo1,"bevanda",articolo2,"dolce",articolo3);
        System.out.println(mappaCat2);
    // 3 metodo
        Map<String,Articolo> mappaCat3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("cibo",articolo1),
                new AbstractMap.SimpleEntry<>("bevanda",articolo2),
                new AbstractMap.SimpleEntry<>("dolce",articolo3)

        );
        System.out.println(mappaCat3);
    }
}