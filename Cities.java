import java.util.HashMap;

public class Cities {
    public static void main(String[] args) {
        HashMap<String, String> Cities = new HashMap<>();

        Cities.put("Ghana", "Accra");
        Cities.put("South Africa", "Cape Town");
        Cities.put("Ethiopia", "Adiss Ababa");
        Cities.put("Rwanda", "Luanda");

        
        Cities.forEach(
            (key, value) -> System.out.println(key + ", " + value)
        ); 
    }
}
