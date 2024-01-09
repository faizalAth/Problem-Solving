public class Tamburo {
    public static void main(String[] args) {
        Tablo t = new Dhol();
        t.test();
        t.bajGaya();
    }
}

class Tablo{
    public void test(){
        System.out.println("Tablo baja...");
    }
    public void bajGaya(){
        System.out.println("Tablo Baj Gaya.");
    }
}

class Dhol extends Tablo{
    public void test() {
        System.out.println("Dhol Baja");
    }
}