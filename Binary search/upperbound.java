public class upperbound {
    public static int findupperbound(int [] arr , int target){
        int low=0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low<=high){
            int mid = low+(high -  low)/2;

            if(arr[mid]>target){
                ans = mid;
                high = mid -1;
            }else{
                low=mid + 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1, 2, 4, 6, 6, 6, 8, 9};
        int target=6;
        int index=findupperbound(arr,target);

        System.out.println("The upper bound of "+target+"is at index:"+index);
        int targetMissing = 5;
        int indexMissing = findupperbound(arr, targetMissing);
        System.out.println("The lower bound of " + targetMissing + " is at index: " + indexMissing);
    } 
}

