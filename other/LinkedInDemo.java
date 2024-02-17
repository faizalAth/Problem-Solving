package other;
public class LinkedInDemo {
    public static void main(String[] args) {
        new B(10,20).display();
    }
}

class A{
    int x;
    A(int x){
        this.x=x;
    }

    void display(){
        System.out.println("Class A: "+x);
    }
}

class B extends A{
    int y;
    B(int x,int y){
        super(x);
        this.y=y;
    }

    void display(){
        super.display();
        System.out.println("Class B: "+y);
    }

}