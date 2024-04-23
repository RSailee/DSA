package arrays;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {
        int [] array = new int[] {0, 0, 1, 1, 3, 0};

        int [] zerosToTheEnd = moveZerosToTheEnd(array);

        System.out.println(Arrays.toString(zerosToTheEnd));

    }

    public static int[] moveZerosToTheEnd(int[] nums) {
        for(int i = 0, j = i+1; i < nums.length && j<=nums.length-1;) {
            if(nums[i] == 0 && nums[j] == 0) {
                j++;
            } else if(nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
        return nums;
    }

}
