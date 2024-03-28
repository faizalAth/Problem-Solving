public class ArrayOfObject {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollNo=101;
        s1.name="Faizal";
        s1.marks=87.25;

        Student s2=new Student();
        s2.rollNo=201;
        s2.name="Farman";
        s2.marks=52.17;

        Student s3=new Student();
        s3.rollNo=301;
        s3.name="Irshad";
        s3.marks=94.81;

        Student[] sArray=new Student[3];        // Array of Object
        sArray[0]=s1;
        sArray[1]=s2;
        sArray[2]=s3;

        for(Student s:sArray){
            System.out.println(s.rollNo + " "+s.name+" "+s.marks);
        }
        System.out.println("************");

    }
}


class Student{
    public int rollNo;
    public String name;
    public double marks;


}