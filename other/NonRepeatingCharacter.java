import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.print(findFirstNonRepeatingCharacter("aavfa"));
    }

    public static int findFirstNonRepeatingCharacter(String text){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        for(char ch : text.toCharArray()){
            if(map.get(ch) == 1)
                return text.indexOf(ch);
        }
        System.gc();
        return -1;

    }
}
