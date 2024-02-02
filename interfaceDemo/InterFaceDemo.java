package interfaceDemo;


public class InterFaceDemo  extends InterDefine implements I1,I2{

    public static void main(String[] args) {
        new InterFaceDemo().m1();
    }    
}


interface I1{
    default void m1(){
        System.out.println("From I1");
    }
}
interface I2{
    default void m1(){
        System.out.println("From I2");
    }
}
class InterDefine{
    public void m1(){
        System.out.println("From InterDefine");
    }
}