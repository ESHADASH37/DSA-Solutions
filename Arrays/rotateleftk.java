public class rotateleftk {
    public static void rotateleftbyk(int[] nums,int k){
        int n=nums.length;
        if(n<=1){
            return;
    }
    k=k%n;

    int[]temp=new int[k];
    for(int i=0;i<k;i++){
        temp[i]=nums[i];
    }
    for(int i=k;i<n;i++){
        nums[i-k]=nums[i];
    }
    for(int i=0;i<k;i++){
        nums[n-k+i]=temp[i];
    }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.print("Before Rotation: ");
        printArray(arr);
        rotateleftbyk(arr, k);

        System.out.print("After Left Rotation by " + k + " places: ");
        printArray(arr);
    }
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}