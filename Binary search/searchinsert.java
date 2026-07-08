public class searchinsert {
    public static int findsearchinsert(int [] arr,int target){
        int low=0;
        int high=arr.length - 1;
        int ans=arr.length;

        while(low<=high){
            int mid=low + (high- low)/2;

            if(arr[mid]>=target){
                ans=mid;
                high = mid- 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr ={1, 3, 5, 6};
        System.out.println("Insert position for 2 :"+ findsearchinsert(arr,2));
    }
    
}
