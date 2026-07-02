import java.util.ArrayList;
public class union {
    public static ArrayList<Integer> findunion(int [] arr1,int [] arr2){
        int n=arr1.length;
        int m= arr2.length;
        int i=0,j=0;
        ArrayList<Integer> unionlist = new ArrayList<>();

        while(i<n && j<m){
            if(arr1[i]<=arr1[j]){
                if(unionlist.isEmpty() || unionlist.get(unionlist.size()-1)!=arr1[i]){
                    unionlist.add(arr1[i]);
                }
                i++;
            }
            else{
                if(unionlist.isEmpty() || unionlist.get(unionlist.size()-1)!=arr2[j]){
                    unionlist.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(unionlist.isEmpty() || unionlist.get(unionlist.size()-1)!=arr1[i]){
                unionlist.add(arr1[i]);
            }
            i++;
        }
         while(j<m){
            if(unionlist.isEmpty() || unionlist.get(unionlist.size()-1)!=arr2[j]){
                unionlist.add(arr2[j]);
            }
            j++;
        }
        return unionlist;
     }
     public static void main(String args[]){
        int[] arr1={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr2={2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union=findunion(arr1,arr2);

        System.out.println("union of two arrays is:"+union);
     }
    
}
