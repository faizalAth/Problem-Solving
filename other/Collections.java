import java.util.*;

import static java.lang.System.*;

public class Collections {
	public static void main(String[] args) {
		out.println("*** Array List ***");
		List number=new ArrayList();
		number.add(20);
		number.add(21);
		number.add(17);

		out.println(number);

		out.println("*** Linked List ***");
		Collection<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(20);
		linkedList.add(21);
		linkedList.add(17);

		out.println(linkedList);

		out.println("*** Hash Set ***");
		HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(20);
		hashset.add(201);
		hashset.add(10);

		out.println(hashset);

		out.println("*** Tree Set ***");
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(200);
		treeset.add(210);
		treeset.add(170);

		out.println(treeset);

	}
}