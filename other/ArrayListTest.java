package other;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,80,90,70};
        int[] b=new int[]{10,20,30,40,80,90};

        System.out.println(Arrays.equals(a,b));

        List<Integer> ll=new ArrayList<>();
        
        ll.add(10);ll.add(20);ll.add(30);ll.add(10);ll.add(50);ll.add(60);

        ll.stream().forEach(data -> System.out.print(data+"\t"));
        System.out.println();
       // ll.remove(Integer.valueOf(10));
        ll.set(2,150);
        ll.add(2,100);

        ll.retainAll(List.of(10,30,150));
        ll.stream().forEach(data -> System.out.print(data+"\t"));
        System.out.println();
        System.out.println("{*************************************************}");
        
    }
}
