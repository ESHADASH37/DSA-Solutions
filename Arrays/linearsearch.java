public class linearsearch {
    public static int search(int []nums,int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int [] arr={4, 2, 8, 5, 1, 9};
        int target=5;

        System.out.print("Array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("\nTarget to find:"+ target);

        int resultindex=search(arr,target);
        if(resultindex!=-1){
            System.out.println("Element found at index:"+  resultindex);
        }
        else{
            System.out.println("Element not found");

        }

        }
    }
    

