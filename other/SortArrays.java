package other;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrays {
    public static void main(String[] args) {
        int [][] nums={{10,20,30},{10,20,30,40,50,60,70},{10,50,80,40},{25,34}};
        sortArrays(nums);
    }

    public static void sortArrays(int[][] data){

        List<int[]> lst=List.of(data);
        
        System.out.println("-----------------------");
        lst.stream().filter(d->d.length > 3).collect(Collectors.toList()).forEach(da->{
            for(int i:da){
                System.out.print(i+" ");
            }
            System.out.println();
        });
   
    }
}
