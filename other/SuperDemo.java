public class SuperDemo {
    public static void main(String[] args) {
        new Child(5);
    }
}

class Parent{

    public Parent() {            // Default Constructor...!
        System.out.println("In Parent Default...");
    }
    public Parent(int x) {       // Parameterized Constructor...!
        this();
        System.out.println("In Parent Parameterized..."+x);
    }
    public void ParentShow(){

        System.out.println("ParentShow...!");
    }
}
class Child extends Parent{
    public Child() {            // Default Constructor...!
        this(20);
        System.out.println("In Child Default...");
    }
    public Child(int x) {       // Parameterized Constructor...!
        //super();
        super.ParentShow();
        this.childShow();
        System.out.println("In Child Parameterized..."+x);
    }
    public void childShow(){
        System.out.println("Child Show...!");
    }
}