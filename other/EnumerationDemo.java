package other;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;

import java.util.Iterator;
import java.util.ListIterator;

public class EnumerationDemo {
    public static void main(String[] args) {
        enumDemo();
        iteratorDemo();
        listIteratorDemo();
    }

    public static void enumDemo(){
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(20);
        stack.push(19);
        stack.push(24);
        stack.push(35);                

        Enumeration<Integer> enumeration=stack.elements();
        System.out.println(enumeration.getClass());
        while(enumeration.hasMoreElements()){
            Integer i=(Integer)enumeration.nextElement();
            System.out.print(i+"\t");
        }
        System.out.println(); 
    }

    public static void iteratorDemo(){
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(20);
        stack.push(19);
        stack.push(24);
        stack.push(35);     
        
        System.out.println();           
        System.out.println(stack);
        
        Iterator<Integer> itDemo=stack.iterator();
        System.out.println(itDemo.getClass());
        while(itDemo.hasNext()){
            Integer i=(Integer)itDemo.next();
            if(i%2==0)
                itDemo.remove();
        }
        System.out.println(stack);
    }

    public static void listIteratorDemo(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(20);
        list.add(19);
        list.add(24);
        list.add(35);     
        
        System.out.println();           
        System.out.println(list);

        ListIterator<Integer> listIterator=list.listIterator();
        System.out.println(listIterator.getClass());
        while(listIterator.hasNext()){
            Integer i=(Integer)listIterator.next();
            if(i%2==0)
                listIterator.remove();
            else 
                listIterator.set(i+15);
        }
        System.out.println(list);
    }
}
