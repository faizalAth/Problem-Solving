import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AnonymousClass {
	public static void main(String[] args) {
		Anonymous an=new Anonymous(){
			public void anonymus() {
				System.out.println(System.currentTimeMillis());
				System.out.println("in Anonymous Class...");
			}
		};
		an.anonymus();

	}
}

class Anonymous{
	public void anonymus(){
		System.out.println("in Anonymous...");
	}
}