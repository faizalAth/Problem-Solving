package other;

import java.util.*;

public class LinkedListDemo{
    public static void main(String[] args) {
        
        List<String> list = new LinkedList<String>();
        list.add("Faizal");
        list.add("Irshad");
        list.add("Sajjad");
        list.add("Saad");
        list.add("Farman");

        System.out.println(list);

        list.sort((a,b)-> a.charAt(0) < b.charAt(0) ? 1 : -1);

        System.out.println(list);
    }


    

}
