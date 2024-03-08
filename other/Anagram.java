package other;
public class Anagram {
    public static void main(String[] args) {
        Integer i1=1250;
        Integer i2=i1;
        Integer i3=i1;
        System.out.println(i1 == i2);
        System.out.println(i2 == i3);
        //System.out.println(checkAnagram("anagram","maragna"));
    }
    public static boolean checkAnagram(String first,String second){
        
        if(first.length() == second.length()){
            if(!sortString(first.toUpperCase()).equals(sortString(second.toUpperCase())))
                return false;
        }else
            return false;
        return true;
    }

    public static String sortString(String text){
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
       return String.valueOf(ch);
    }
}
