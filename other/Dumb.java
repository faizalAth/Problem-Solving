import static java.lang.System.*;
public class Dumb{
    static public void main(String...args) {
        char c='G';
        int ch=c;
        out.println(ch);
        A a=new B();
        a.x1();
    }
}

class A{
    public void x1(){
        out.println("A... X1");
    }
}
class B extends A{
    public void x1(){
        out.println("B... X");
    }
}