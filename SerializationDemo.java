import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.List;

public class SerializationDemo {
    
    public static void main(String[] args) throws IOException,ClassNotFoundException, ParseException{
        List<String> lastInOutTime=List.of("18:30","08:10");

        String[] stringArray = lastInOutTime.toArray(new String[0]);

        // Print the string array
        for (String str : stringArray) {
            System.out.println(str);
        }

        System.out.println(stringArray);

        Confused c1=new Confused();
        c1.display();
        new Confused().display();
        new Confused().display();

        FileOutputStream fos=new FileOutputStream("hello.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c1);  // Serialization

        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("hello.txt"));
        Confused cfd =(Confused) inputStream.readObject();
        System.out.println(cfd.levelOfConfusion);  // De-serialization
    }
}


class Confused implements Serializable{
    transient static int level;
     int levelOfConfusion;

    protected void display(){
        level+=184;
        levelOfConfusion+=154;

        System.out.println(level + "   "+levelOfConfusion);
    }

}

class Abc extends Confused{
    
    public void display(){

    }
}
