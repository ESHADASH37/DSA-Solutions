import java.util.Scanner;
public class sndlargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int largest=arr[0];

         for(int i = 1 ;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
         }
         int slargest = -1;
         for(int i=0;i< n;i++){
            if(arr[i]>slargest && arr[i]!=largest)
                slargest=arr[i];
         } 
         System.out.println("Second largest:"+slargest);

         sc.close();
        

    }
    
}
