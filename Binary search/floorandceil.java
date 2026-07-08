public class floorandceil {
    public static int findfloor(int []  arr,int x){
        int low=0;
        int high = arr.length-1;
        int floor=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]<=x){
                floor=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return floor;
    }
    public static int findceil(int[] arr,int x){
        int low=0;
        int high = arr.length-1;
        int ceil=-1;

        while(low<=high){
            int mid=low+(high - low)/2;
            if(arr[mid]>=x){
                ceil=arr[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ceil;

    }
    public static void main(String[] args) {
        int arr[]={3, 4, 4, 7, 8, 10};
        int x = 5;
         int floor = findfloor(arr, x);
         int ceil = findceil(arr, x);
         System.out.println("Floor of " + x +" is:"+floor);
         System.out.println("ceil of " + x +" is:"+ceil);
    }
    
}
