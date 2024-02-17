package other;
import java.util.Map;
import java.util.HashMap;
public class FindDuplicate {
    public static void main(String[] args) {
        findDuplicate("Faizal Athaniya");
    }

    public static void findDuplicate(String text){
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
        }

        map.forEach((k,v)->{
            if(v > 1)
                System.out.println(k + " " + v);
        });

    }
}
