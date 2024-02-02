package map;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVSWeakHashMap {
    public static void main(String[] args){

        WeakHashMap<Student,Integer> map=new WeakHashMap<>();
        //ConcurrentHashMap<Student,Integer> map=new ConcurrentHashMap<>();


        Student key=new Student();
        map.put(key,20);
        map.put(null,null);
        System.out.print(map+"\t");
        key=null;
        System.gc();
        System.out.print(map+"\t");
    }
}

class Student{

    @Override
    public String toString() {
        int d=0Xfacbe;
        return "Student toString"+d+"\t";
    }

    @Override
    public void finalize(){
        System.out.println("finalize Method called!");
    }
    
    
}

