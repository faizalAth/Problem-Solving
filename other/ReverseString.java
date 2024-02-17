package other;
public class ReverseString {

    public static void main(String[] args) {
        
        System.out.println(reverse("Faizal"));

    }

    public static String reverse(String name){

        char[] charArray=name.toCharArray();
        int start=0,end=name.length()-1;

        while(start < end){
            char temp=charArray[end];
            charArray[end]=charArray[start];
            charArray[start]=temp;

            start++;
            end++;
        }

        return String.valueOf(charArray);
    }
}