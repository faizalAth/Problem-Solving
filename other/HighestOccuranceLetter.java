import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HighestOccuranceLetter {
    public static void main(String[] args) {
        Map<Character, Integer> map = findHighestOccuranceCharacter("My Name Is Faizal Athaniya");
    }

    private static Map<Character, Integer> findHighestOccuranceCharacter(String myNameIsFaizalAthaniya) {
        Map<Character, Integer> map = new HashMap<>();
        char[] array = myNameIsFaizalAthaniya.toCharArray();

        List<Character> returnMap = new ArrayList<>();
        int count = 1;char ans=0;
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) == 0 ? 1 : map.getOrDefault(array[i], 0) + 1);

            if(count < map.get(array[i])) {
                ans = array[i];
                count = map.get(array[i]);
            }
        }
            System.out.println( ans + " === " + count + "\n"+ map);

        return map;
    }
}
