import java.util.HashMap;

public class maxlenzero {
    public static int maxlengthzero(int [] arr){
        HashMap<Integer,Integer> map= new HashMap<>();

        int maxlength=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxlength=i+1;            }
                else if(map.containsKey(sum)){
            int previous=map.get(sum);
            maxlength=Math.max(maxlength,i-previous);
        }
        else{
            map.put(sum, i);
        }
    }
        return maxlength;
    }
    public static void main(String args[]){
        int [] arr={15, -2, 2, -8, 1, 7, 10, 23};
        int result=maxlengthzero(arr);
        System.out.println("length of the longest subarray with zero sum:"+result);
    }
    
}
