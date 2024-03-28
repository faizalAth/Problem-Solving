package other;



public class Conversion extends Children{
    
    public Conversion(){
        System.out.println("Parent constructor...");
    }
    static{
        System.out.println("Parent static...");
    }{
        System.out.println("Parent dynamic...");
    }

    public static void main(String[] args) {
        System.out.println("start");
        new Conversion();
        System.out.println("end");
     }
}
 
class Children {

    public Children(){
        System.out.println("child constructor...");
    }
    static{
        System.out.println("child static...");
    }{
        System.out.println("child dynamic...");
    }

    
}