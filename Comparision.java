import java.util.*;

public class Comparision {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        long start,end;
        start=System.currentTimeMillis();
        int i=0;
        while(i<1_99_999){
            list.add(String.valueOf(i));
            i++; 
        }
        
        end=System.currentTimeMillis();
        System.out.println("Arraylist "+(end-start) + " --- " + list.size());
        System.out.println("***************************");

        start=0;
        end=0;
        LinkedList<String> llist=new LinkedList<>();
        start=System.currentTimeMillis();
        int j=0;
        while(j<1_99_999){
            llist.add(String.valueOf(j));
            j++; 
        }
        
        end=System.currentTimeMillis();
        System.out.println("LinkedList "+(end-start) + " --- " + llist.size());
    }
}
