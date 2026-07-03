public class majority {
    public static int majorityelement(int arr[]){
        int count = 0;
        int candidate = 0;
         for(int i = 0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count = 1;
            }
            else if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
         }
         int verificationcount = 0;
         for(int num:arr){
            if(num==candidate){
                verificationcount++;
            }
         }
         if(verificationcount>arr.length/2){
            return candidate;
         }
         return -1;
    }
    public static void main(String args[]){
        int []arr={7, 0, 0, 1, 7, 7, 2, 7, 7};
        int result=majorityelement(arr);
        System.out.println("the majority element is:"+result);

    }
}
