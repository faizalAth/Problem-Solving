package other;

public class Chai {
    public static void main(String[] args) {
        
    }
   
    static{
        System.out.println("Outer block!");
    }
    private static class Inner{
        static{
            System.out.println("Inner block!");
        }
    }
}

