package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 2, 3, 4, 5};

        int distinctArray = removeDuplicates(array);

        System.out.println(distinctArray);

    }

        public static int removeDuplicates(int[] nums) {
            int res = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[res] = nums[i];
                    res++;
                }
            }
            return res;
        }

}
