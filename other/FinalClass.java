final public class FinalClass {
	private static final int final_var=20;
	public static void main(String[] args) {
		// final_var=10;
	}

	// final
	public void show(){
		System.out.println("in Calc show...");
	}
}

class Calc { //extends  FinalClass{
	public void show(){
		System.out.println("in Calc show...");
	}
}
