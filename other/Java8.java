package other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Java8 implements Cloneable{
    String s1="150";
    public static void main(String[] args) throws ParseException, CloneNotSupportedException {
       
        Set<String> entries=new LinkedHashSet<>();
        entries.add("09:30:10");
        entries.add("11:15:30");  //1.45 
        entries.add("11:30:00");
        entries.add("13:30:00");  //2.00
        entries.add("14:00:00");
        entries.add("16:15:00");  // 2.15
        entries.add("16:30:00");
        entries.add("18:30:00");  // 2.00

    
        long total_time=0;

        
        Iterator<String> itr=entries.iterator();
        while(itr.hasNext()){

            Date d1=new SimpleDateFormat("hh:mm:ss").parse((String) itr.next());
            Date d2=new SimpleDateFormat("hh:mm:ss").parse((String)itr.next());

            total_time+=d2.getTime()-d1.getTime();
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            sdf.setTimeZone(java.util.TimeZone.getTimeZone(ZoneOffset.UTC));
            
            System.out.println(sdf.format(new Date(total_time)));

    }

}



