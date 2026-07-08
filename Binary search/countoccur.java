public class countoccur {
    private static int findfirst(int [] arr,int target){
        int low = 0;
        int high = arr.length - 1;
        int firstindex = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]== target){
                firstindex = mid;
                high = mid - 1;
            }else if(arr[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return firstindex;
    }
    private static int findlast(int []  arr ,int target){
        int low = 0;
        int high = arr.length - 1;
        int lastindex = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]== target){
                lastindex = mid;
                low = mid + 1;
            }else if(arr[mid]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return lastindex;
    }
    public static int countoccurance(int [] arr,int target){
        int first = findfirst(arr,target);
        if (first == -1)
            return -1;
        int last = findlast(arr,target);
        return last - first +1;
    }
    public static void main(String args[]){
        int arr[] ={2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;
        int count = countoccurance(arr, target);
        System.out.println("the element "+ target + " occurs "+ count +" times");
    }
}
