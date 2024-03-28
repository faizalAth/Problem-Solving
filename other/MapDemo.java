import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // creating objects of HashMap and IdentityHashMap
        Map<String, String> hm = new HashMap<>();
        Map<String, String> ihm = new IdentityHashMap<>();
        // adding the key value mappings in HashMap object
        hm.put("Hello","505");
        hm.put(new String("Hello"),"101");
        // adding the key value mappings in HashMap object
        ihm.put("Hello","202");
        ihm.put(new String("Hello"),"506");
        // displaying both the maps
        System.out.println("HashMap elements: " + hm);
        System.out.println("HashMap elements: " + ihm);
        // printing the size of HashMap and IdentityHashMap objects
        // hm.size() will print 1 since it compares the objects logically
        // and both the keys are same
        System.out.println("Size of HashMap is : "+hm.size());
        // ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap is : "+ihm.size());
    }
}