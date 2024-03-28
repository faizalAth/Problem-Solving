import java.util.ArrayList;
		import java.util.Collections;
		import java.util.Comparator;
		import java.util.List;

		import static java.lang.System.*;
public class ComparableDemo {

	public static void main(String[] args){

		String a="Hello";
		String b="Faizal";
		String c=a+b;
		String d="HelloFaizal";
		out.println(c==d);
		out.println(c.equals(d));

		out.println("****** Integer *********");
		List<Integer> list=new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(91);
		list.add(63);
		list.add(9);

		Collections.sort(list);
		out.println(list);

		Collections.sort(list,(j, k) -> j%10>k%10 ? 1 : -1);
		out.println(list);

		out.println("****** String *********");
		List<String> citis=new ArrayList<>();
		citis.add("Basu");
		citis.add("Chhapi");
		citis.add("Meta");
		citis.add("Mahi");
		citis.add("Changa");
		Collections.sort(citis);
		out.println(citis);

		Comparator<String> cmp = (String s1,String s2)-> s1.charAt(s1.length()-1)>s2.charAt(s2.length()-1) ? 1 : -1;

		Collections.sort(citis,cmp);
		out.println(citis);
	}
}
