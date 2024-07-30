
import java.util.*;

public class Itinerarytickets {
     public static String StartgetStart (HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();
       
        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
        }
         for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
     }

     public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");      
     }
}
