public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("StaticBlockTest");

    }
}
class StaticBlockTest{
    static int x=10;
    public StaticBlockTest(){
        System.out.println("From Constructor...");
    }
    public StaticBlockTest test(){
        x=20;
        return this;
    }

    static{
        System.out.println("from Static Block...");
    }
    {
        System.out.println("from Dynamic Block...");
    }
}