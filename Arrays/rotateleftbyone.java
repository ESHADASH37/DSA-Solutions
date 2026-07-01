public class rotateleftbyone {
    public static void rotateLeftByOne(int[] nums) {
        int n = nums.length;
        if (n <= 1) return;
        int temp = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i]; 
        }
        nums[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Before rotation: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        rotateLeftByOne(arr);

        System.out.print("After left rotation by one: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}

    

