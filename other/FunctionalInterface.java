import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@java.lang.FunctionalInterface
interface Animal{
	int show(int x,int y,int z);
}

public class FunctionalInterface {
	public static void main(String[] args) throws IOException {
		int total=0;
		Animal animal=(k,s,l) -> k+s+l;

		total=animal.show(20,25,17);
		System.out.println(total);

	}
}
