public class appearsingle {
    public static int getsinglenumber(int[]arr){
        int xor=0;
    for(int i=0;i<arr.length;i++){
        xor=xor ^ arr[i];
    } 
    return xor;
   }
   public static void main(String args[]){
    int arr[]={4, 1, 2, 1, 2};

    int result = getsinglenumber(arr);
    System.out.print("Array:");
    for(int num:arr){
        System.out.print(num+" ");
    }
    System.out.println();

    System.out.println("the number that is single:"+result);
   }
    
}
