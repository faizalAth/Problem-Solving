import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {
	public static void main(String[] args) throws IOException {

		System.out.println(System.in.read());

		Scanner sc=new Scanner(System.in);
		System.out.println(sc.nextInt());

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(bf.read());
	}
}
