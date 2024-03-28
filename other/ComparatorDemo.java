import java.util.*;
import java.util.Collections;

import static java.lang.System.*;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();

		cities.add("Palanpur");
		cities.add("Chhapi");
		cities.add("Basu");
		cities.add("Kanodar");
		cities.add("Gandhinagar");
		cities.add("Meta");
		cities.add("Goa");

		out.println(cities);
		Collections.sort(cities,(s1,s2)-> s1.length()>s2.length() ? 1 : -1 );
		out.println(cities);

	}
}