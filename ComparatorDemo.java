import java.util.*;


public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator comp=(o1, o2)-> {
            Integer i1=(Integer)o1;
            Integer i2=(Integer)o2;
            if(i1 > i2)
                return -1;
            else
            if(i1 < i2)
                return 1;
            else
                return 0;
        };

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(18);
        list.add(95);
        list.add(45);

        Student[] lst=new Student[5];
        lst[0]=new Student(1,"edfg");
        lst[1]=new Student(5,"rdfgsd");
        lst[2]=new Student(4,"fdgefsdgxfg");
        lst[3]=new Student(8,"fdhg");
        lst[4]=new Student(3,"fg");

        Arrays.sort(lst);
        //list.sort(comp);
        //Collections.sort(list,comp);
        for(Student s:lst)
            System.out.println(s);
    }
}
class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "name=" + name +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        if(this.name.length() > o.name.length()){
            return -1;
        }else
        if(this.name.length() < o.name.length()){
            return 1;
        }else
            return 0;

//        if( this.id > o.id )
//            return 1;
//        else if(this.id < o.id)
//            return -1;
//        else
//            return 0;
    }
}

class ABC implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}