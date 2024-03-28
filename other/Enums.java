
enum Brand{

	TATA,AMBANI(200),BATA;
	int rank;
	private Brand(int rank){
		this.rank=rank;
	}
	private Brand(){

	}

	public int getRank() {
		return rank;
	}

	private void setRank(int rank) {
		this.rank = rank;
	}
}

public class Enums {
	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> c= Class.forName("java.lang.String");
	
		System.out.println(c.getSimpleName());
		for(Brand b:Brand.values()){
				System.out.println(b.name()+" = "+b.getRank() + " = " + b.compareTo(b.TATA));
		}

	}
}
