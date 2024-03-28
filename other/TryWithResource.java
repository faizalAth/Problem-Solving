import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static  java.lang.System.*;


public class TryWithResource {
	public static void main(String...args) throws IOException {

		List<String> list=new ArrayList<>();
		list.add("Faizal");
		list.add("Irshad");
		list.add("Farman");
		list.add("sajjad");
		list.add("Moin");


		out.println(list);
		Collections.sort(list);
		out.println(list);

	}
}