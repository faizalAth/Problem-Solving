package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapDemo {

    public static void main(String[] args) {
        

        HashMap map=new HashMap();

        map.put("Faizal",77790);
        map.put(8320,"Farmna");
        map.put("Saad",4564);
        map.put("Sajjad",5465);
        map.put(926518,"Irshad");

        System.out.println(66 & 255);

        System.out.println(map.replace(8320,"Bhuro"));

        Set entries=map.entrySet();

        Iterator iterator=entries.iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();

            System.out.println(entry.getKey() + " === " + entry.getValue());
        }

        map.keySet().stream().filter(data -> data.toString().length() > 4).forEach(System.out::println);

        System.out.println("**********************************");

        HashMap<String,Integer> map1=new HashMap<>();
		 
		map1.put("Faizal",1);
		map1.put("Farman",2);
		map1.put("Irshad",3);
		map1.put("Sajjad",4);
		map1.put("Saad",5);
		
		System.out.println(map1);
    }
    
}
