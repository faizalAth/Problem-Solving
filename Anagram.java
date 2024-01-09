public class Anagram {
    public static void main(String[] args) {
        System.out.println(checkAnagram("anagram","margana"));
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
