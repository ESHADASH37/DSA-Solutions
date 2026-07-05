import java.util.ArrayList;
import java.util.Collections;
public class leader {
    public static ArrayList<Integer> findleader(int [] arr){
        ArrayList<Integer> leaders = new ArrayList<>();
        int n=arr.length;

        int maxfromright=arr[n-1];
        leaders.add(maxfromright);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxfromright){
                leaders.add(arr[i]);
                maxfromright=arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String args[]){
        int [] arr={16, 17, 4, 3, 5, 2};
         ArrayList<Integer> result =findleader(arr);
         
         System.out.println("Leaders of array :"+result);
    }
    
}
