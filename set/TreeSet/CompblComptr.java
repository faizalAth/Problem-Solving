package set.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CompblComptr{
    public static void main(String[] args) {

        Comparator<Student> comp=(s1,s2)-> s1.getName().length() > s2.getName().length() ? 1 : s1.getName().length() < s2.getName().length() ? -1 : s1.compareTo(s2);

        Set<Student> set=new TreeSet<>(comp);

        set.add(new Student(1,"Faizal"));
        set.add(new Student(3,"Irshad"));
        set.add(new Student(2,"Farman"));
        set.add(new Student(5,"Saajad"));
        set.add(new Student(4,"Saad"));

        System.out.println(set);

        List list=new ArrayList();
        list.add(new Student(1,"Faizal"));
        list.add(new Student(3,"Irshad"));
        list.add(new Student(2,"Farman"));
        list.add(new Student(5,"Saajad"));
        list.add(new Student(4,"Saad"));

        System.out.println("***************************");

        Collections.sort(list,comp);
        System.out.println(list);
    }
}

class Student implements Comparable<Student>{

    private int id;
    private String name;
    
    public Student() {

    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student student){
        if(this.id > student.getId())
            return 1;
        else
            if(this.id < student.getId())
                return -1;
        else
            return 0;
    }
    

}
