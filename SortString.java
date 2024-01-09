public class SortString {
    public static void main(String[] args) {
        sortString("margana");
    }

    public static void sortString(String text){
        char[] ch=text.toLowerCase().toCharArray();

        for(int i=0;i<ch.length-1;i++){
            for(int j=i;j<ch.length-1;j++){
                if(ch[i] > ch[j+1]){
                    char temp=ch[i];
                    ch[i]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
        System.out.println(ch);
    }
}