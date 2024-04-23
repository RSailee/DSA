package arrays;

import java.util.Arrays;

public class RightRotateByK {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5};

        rotate(array, 3);
        System.out.println(Arrays.toString(array));

    }

    public static void rotate(int[] nums, int k) {
        int n = k % nums.length;
        int l = nums.length;
        reversedArray(nums, 0, l-1);
        reversedArray(nums, 0, n-1);
        reversedArray(nums, n, l-1);
    }

    public static void reversedArray(int[] nums, int start, int end) {
        int i = start, j = end;
        while(i<=j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }


}
