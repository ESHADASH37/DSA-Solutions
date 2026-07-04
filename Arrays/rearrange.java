public class rearrange {
    public static int [] rearrangearray(int [] num){
        int n=num.length;
        int [] result=new int[n];

        int posiix=0;
        int negix=1;
        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                result[posiix]=num[i];
                posiix+=2;
            }
            else{
                result[negix]=num[i];
                negix+=2;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int [] num={3, 1, -2, -5, 2, -4};

        int [] rearrange=rearrangearray(num);

        System.out.println("Rearrange array");
        for(int nums:rearrange){
            System.out.print(nums + " ");
        }
        System.out.println();
    }
    
}
