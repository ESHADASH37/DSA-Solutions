public class binarysearch {
    public static int binarysearchsort(int[] num,int target){
        int low=0;
        int high =num.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(num[mid]==target){
                return mid;
            }
            if(num[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int[] num={1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;

        int index = binarysearchsort(num , target);

        if(index!=1){
            System.out.println("Element found at index:"+index);
        }else{
             System.out.println("Element not found at index:"+index);
        }
    }
    
}
