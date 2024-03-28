public class DecimalToBinary {
	static int index=0;
	public static void main(String[] args) {

		int[]binary=decimalToBinary(13);
		for(int i=index-1;i>=0;i--)
			System.out.print(binary[i]);
	}
	public static int[] decimalToBinary(int number){

		int[]binary=new int[10];
		while(number>0){
			binary[index++]=number%2;
			number=number/2;
		}
		return binary;
	}
}
