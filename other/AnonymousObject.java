public class AnonymousObject {
    public static void main(String[] args) {
        new Rooms().totalRooms();
        Rooms r3=new Rooms();
        new Rooms().totalRooms();
        r3.totalRooms();
        var brand = Mobile.brand;
    }
}

class Rooms{
    static int room;
    public Rooms(){
        room++;
    }
    public void totalRooms(){
        System.out.println(room);
    }
}