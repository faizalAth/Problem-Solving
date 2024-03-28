import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;

public class Timer {
    public static void main(String[] args) throws ParseException {

        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(1,1);

        hs.put(3,3);
        hs.put(2,2);

        System.out.println(hs.get(3).hashCode());

        LinkedHashMap<String,Integer> lhs=new LinkedHashMap<>();
        lhs.put("wwew",1);
        lhs.put("null",2);

        System.out.println(lhs);

        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("wwew",1);
        tm.put("null",2);

        System.out.println(tm);
    }
}
