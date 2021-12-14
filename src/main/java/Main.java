import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitaisEuropa = new HashMap<String, String>();
        capitaisEuropa.put("Inglaterra", "Londres");
        capitaisEuropa.put("Suécia", "Estocolmo");
        capitaisEuropa.put("Noruega", "Oslo");
        capitaisEuropa.put("Romenia", "Bucareste");
        capitaisEuropa.put("Irlanda", "Dublin");
        capitaisEuropa.put("Alemanha", "Berlin");
        capitaisEuropa.put("Ucrania", "Kiev");
        capitaisEuropa.put("Bulgaria", "Sofia");

        for (String i : capitaisEuropa.keySet()) {
            System.out.println("País: " + i + " -" + " Capital: " + capitaisEuropa.get(i));
        }
        System.out.println(" ");
        
        HashMap<String, Integer> capitaisPopulacao = new HashMap<String, Integer>();
        capitaisPopulacao.put("Londres", 8278251);
        capitaisPopulacao.put("Estocolmo", 1728200);
        capitaisPopulacao.put("Oslo", 634293);
        capitaisPopulacao.put("Bucareste", 1883425);
        capitaisPopulacao.put("Dublin", 544107);
        capitaisPopulacao.put("Berlin", 3711930);
        capitaisPopulacao.put("Kiev", 2765500);
        capitaisPopulacao.put("Sofia", 1681592);

        for (String i : capitaisPopulacao.keySet()) {
            System.out.println("Capital: " + i + " -" + " População: " + capitaisPopulacao.get(i));

        }
    }
}
