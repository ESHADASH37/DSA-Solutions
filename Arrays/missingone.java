public class missingone {
    public static int findmissingno(int[]arr,int n){
        int xor1=0;
        int xor2=0;

        for(int i=0;i<arr.length;i++){
            xor2=xor2 ^ arr[i];
            xor1=xor1 ^ (i+1);
        }

        xor1 = xor1 ^ n;

        return xor1 ^ xor2;
    }
    public static void main(String args[]){
        int[] array={1, 2, 4, 5, 6};
        int n=6;
        int missing=findmissingno(array,n);

        System.out.println("missing number:"+missing);

    }
    
}
