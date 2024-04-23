package arrays;

import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5};

        int [] rotateArrayByOne = rotateArrayByOne(array);

        System.out.println(Arrays.toString(rotateArrayByOne));

    }

    private static int[] rotateArrayByOne(int[] array) {
        int temp = array[0];
        for(int i=0; i<array.length -1; i++) {
            array[i] = array[i+1];
        }
        array[array.length -1] = temp;
        return array;
    }
}
