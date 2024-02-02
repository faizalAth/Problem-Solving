import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,5);
        System.out.println(vector.capacity());
        vector.setSize(9);
        
        vector.add(7,20);
        vector.set(3,30);
        System.out.println(vector.capacity());
        System.out.println(vector);


    }
}
