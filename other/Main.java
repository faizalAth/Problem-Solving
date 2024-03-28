import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// static import
import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>(Arrays.asList("Red", "Green","Yellow","blue","pink"));

        reverse(lst);

        reverseList(lst).forEach(System.out::println);
        AtomicInteger x= new AtomicInteger(10);
        compareList(lst,Arrays.asList("pink","Green","orange","blue","black")).forEach((color,available) -> {
            System.out.println(color + " : "+available+(x.incrementAndGet()));
        });
    }

    public static List<String> reverseList(List<String> lst){
        byte lst_index=(byte)(lst.size()-1);

        for(byte i=0;i<(lst.size()/2);i++){
            String left=lst.get(i);
            lst.set(i,lst.get(lst_index));
            lst.set(lst_index,left);
            lst_index--;
        }
        return lst;
    }

    // compare two list and return true if present in second list else return false...
    public static Map<String,String> compareList(List<String> list1,List<String> list2){

        Map<String,String> map=new HashMap<>();
        list1.forEach(l1->{
            map.put(l1,list2.contains(l1) ? "Yes" : "No");
        });

        return map;
    }
}