package other;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Integer> set=new TreeSet<Integer>((i1,i2)-> ((Integer)i1 > (Integer)i2) ? -1 : ((Integer)i1 < (Integer)i2) ? 1 :0);

        set.add(20);
        set.add(30);
        set.add(10);
        set.add(17);
        set.add(80);
        set.add(40);

        System.out.println(set);

        ArrayList list=new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}