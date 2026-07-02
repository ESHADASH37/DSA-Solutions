public class maxconsecutive {
    public static int findmaxconsecutive(int[] nums){
        int maxones=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>maxones){
                    maxones=count;
                }
            }
            else{
                count=0;
            }
        }
        return maxones;
    }
    public static void main(String args[]){
        int [] arr={1, 1, 0, 1, 1, 1, 0, 1};
        
        int result=findmaxconsecutive(arr);
        System.out.print("Array:");
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Maximum of two consecutive numbers"+result);
    }
    
}
