public class longarray {
    public static int longestarraywithksum(int[] arr,long k){
        int n=arr.length;
        int left=0;
        long currentsum=0;
        int maxlength=0;

        for(int right=0;right<n;right++){
            currentsum+=arr[right];
            while(left<=right && currentsum>k){
                currentsum-=arr[left];
                left++;
            }
            if(currentsum==k){
                maxlength=Math.max(maxlength,right-left+1);
            }
        }
        return maxlength;
    }
    public static void main(String args[]){
        int []arr={1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        long k=3;

        int result=longestarraywithksum(arr,k);
        System.out.println("length of longest subarray with sum "+ k +" is: "+result);

    }
    
}
