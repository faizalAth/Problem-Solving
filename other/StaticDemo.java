public class StaticDemo {
int xx;
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.price=12500;
        m1.name="Pixel 6pro";

        Mobile m2=new Mobile();
        m2.price=17000;
        m2.name="Pixel 7A";

        Mobile.brand="Google";
        m1.show();
        m2.show();

        new StaticDemo().test();
    }
    static int x;
    public void test(){
        x=x+1;
        System.out.println(x);
    }
}

class Mobile{
    int price;              // Instance Variable
    String name;            // Instance Variable
    static String brand;    // Class Level Variable

    public void show(){
        System.out.println(name+" "+ price+ " " + brand);
    }
}
