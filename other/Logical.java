package other;
import java.math.BigDecimal;
import java.util.*;

public class Logical {
    public static void main(String...a) {
        
        Map<Hello,Integer> map = new HashMap<>();
        List<Hello> list= Arrays.asList(new Hello("Faizal"),new Hello("Farman"),new Hello("Irshad"),new Hello("Faizal"));
        list.forEach(System.out::println);

    }



}
class Hello {
    String str;

    public Hello(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hello hello)) return false;
        return Objects.equals(str, hello.str);
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }
}