package other;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int []array={10,20,30,40,50,50,58};
        System.out.println(check(array));
    }

    public static boolean check(int[] nums){

        HashSet<Integer> entry=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(entry.contains(nums[i]))
                return true;
            entry.add(nums[i]);
        }
        return false;
    }

}
