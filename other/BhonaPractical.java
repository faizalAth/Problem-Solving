package other;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

public class BhonaPractical {
    public static void main(String[] args) {
        Hashtable<String,Integer> table=new Hashtable<>();
        table.put(new String("1"),1);
        table.put(new String("1"),14);
        System.out.println(table.size());
    }
}