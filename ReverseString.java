public class ReverseString {
    public static void main(String[] args) {
        reverString("Faizal Athaniya");
    }

    //native :-  which is implemented in other languages like c/c++
    public native void test();

    public static void reverString(String text){
        char[] ch = text.toCharArray();
        int start=0;
        int last=ch.length-1;
        
        while(start < last){
            char temp = ch[start];
            ch[start]=ch[last];
            ch[last]=temp;

            start++;
            last--;
        }
        System.out.println(ch);
    }
}