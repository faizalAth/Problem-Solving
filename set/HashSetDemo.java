package set;

import java.util.LinkedHashSet;


public class HashSetDemo {
    public static void main(String[] args){
        
        LinkedHashSet set=new LinkedHashSet<>();
        
        set.add(10);
        set.add('c');
        set.add("String");
        set.add(null);
        System.out.println(set.add(010));

        System.out.println(set);

        
    }

}
