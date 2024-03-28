public class StringDemo {

    public static void main(String[] args) {
        String s1="Faizal";
        String s2="Faizal";
        String s3=new String("Faizal");
        String s4=new String("Faizal");

        StringBuilder sb1=new StringBuilder("Faizal");
        StringBuilder sb2=new StringBuilder("Faizal");

        System.out.println(sb1.equals(sb2));

    }
    static int x;
    public void test(){
       x=x+1;
       System.out.println(++x);
    }
}