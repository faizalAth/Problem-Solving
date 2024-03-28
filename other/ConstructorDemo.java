public class ConstructorDemo {
    public static void main(String[] args) {
        Students ss=new Students(20,"Faizal",98.85);
        System.out.println(ss.toString());
    }
}
class Students {
    public int rollNo;
    public String name;
    public double marks;

    public Students(){
        System.out.println("in Default constructor...");
    }
    public Students(int rollno){
        this();
        this.rollNo=rollno;
        System.out.println("in 2 constructor..."+rollno);
    }
    public Students(int rollno, String name){
        this(rollno);
        this.name=name;
        System.out.println("in 2 constructor..."+name);
    }
    public Students(int rollno, String name,double marks){
        this(rollno,name);
        this.marks=marks;
        System.out.println("in 3 constructor..."+marks);
    }

    @Override
    public String toString() {
        setName("Farman");
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setName(String name){
        this.name=name;
        this.getName();
    }

    public void getName(){
        System.out.println(name);
    }
}