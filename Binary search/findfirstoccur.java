public class findfirstoccur {
    public static int findfirstoccurance(int [] arr ,int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low <=high){
            int mid= low+(high - low);
            if(arr[mid]==target){
                ans=mid;
                low = mid + 1;
            }else if(arr[mid]<target){
                low = mid +1 ;
            }else{
                high = mid -1 ;
            }
        
        }
        return ans;
    }
    public static void main (String args[]){
        int [] arr ={3, 4, 4, 4, 7, 8, 10};
        int target = 4;
        int lastidx =findfirstoccurance(arr,target); 
        System.out.println("the last occurrance of " + target+ " is at index :"+lastidx);
    
    }
    
}
