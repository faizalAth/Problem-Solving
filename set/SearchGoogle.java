package set;

import java.io.IOException;

public class SearchGoogle {
    
	public static void main(String[] args) throws IOException {
		Student s1=new Student();
		s1.id=105;
		Student s2=new Student();

		System.out.println(s1.id);
		System.out.println(s2.id);
	}
}

class Student{
	public int id;

}