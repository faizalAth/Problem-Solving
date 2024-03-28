import java.util.ArrayList;
import java.util.List;

public class FormatAmount {
    public static void main(String[] args) {
        System.out.print(formatAmount("12584555858"));
    }
    static String formatAmount(String amount){

        List<String> ls=new ArrayList<>();
        System.out.println(ls.size());

        StringBuilder sb=new StringBuilder();
        String point=amount;
        if(amount.contains(".")){
            point = amount.split("\\.")[1];
            amount= amount.split("\\.")[0];
        }else{
            point = "00";
        }


        String after=amount.substring(amount.length()-3,amount.length());
        String before=String.valueOf(Integer.parseInt(amount)/1000); // for Taking last 3 digit...
        int count=before.length() % 2 ==0 ? 1 : 0;

        if(Integer.parseInt(before) > 0){
            for(int i=0;i<before.length();i++){
                sb.append(before.charAt(i));
                if(count %2 ==0){
                    sb.append(",");
                }
                count++;
            }
        }
        return sb.append(after).append(".").append(point).toString();
    }
}
