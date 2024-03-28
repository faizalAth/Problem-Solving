import java.math.BigDecimal;
import java.util.Optional;

public class ArraytoString {
    public static void main(String[] args) {

        String s1="null";
        String s2=null;
        String s3=new String();
        s3=null;
        String s4=new String();
        System.out.println(s1.equals(s2));

        String[] ss=new String[]{"abc","cdf","dsf","gddfg"};
        String sss=String.join(",",ss);

        int i=10;
        int j=20;
        System.out.println(formatAmount(String.valueOf(new BigDecimal(String.format("%.2f",(double)1865.17)))));
    }
    public static String formatAmount(String amount){
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
