public class removedupli {
    public static int removeduplicates(int arr[]){
    int n=arr.length;
    if(n==0){
        return 0;
    }
    int i = 0;
    for (int j = 1;j<n;j++){
        if(arr[j]!=arr[i]){
            i++;
            arr[i]=arr[j];
        }
    }
    return i+1;
}
 public static void main(String args[]){
    int[] arr={1,2,3,3,3,3,3,4,5,8,9};
    int newlength=removeduplicates(arr);
    System.out.print("Array after removing duplicates:");
    for(int k=0;k<newlength;k++){
        System.out.print(arr[k] + " ");
        }
        System.out.println();
        System.out.println("New length: " + newlength);

    }
}

