import java.util.HashSet;

public class twosum {
    public static boolean hastwosum(int [] nums,int target){
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            int complement =  target - num;
            if(seen.contains(complement)){
                return true;
            }
            seen.add(num);
        }
        return false;

    }
    public static void main(String args[]){
        int [] nums={2, 7, 11, 15};
        int target=9;
        if(hastwosum(nums,target)){
            System.out.println("Yes, a pair with the given sum exists.");
        }
        else{
            System.out.println("No, no such pair exists.");
        }

    }
    
}
