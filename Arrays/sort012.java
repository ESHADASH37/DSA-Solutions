public class sort012 {
    public static void sortedarray(int[]arr){
        int low=0;
        int mid=0;
        int high=arr.length - 1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main (String args[]){
        int [] arr={2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting:  ");
        printArray(arr);

        sortedarray(arr);

        System.out.println("After sorting:  ");
        printArray(arr);

    }
    private static void printArray(int [] arr){
        for(int num:arr){
            System.out.print(num + "  ");
        }
        System.out.println();
    }
    
}
