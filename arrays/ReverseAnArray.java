package arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] array = new int[] {12, 15, 2, 19, 5};

        var reveredArray = getReversedArray(array);

        System.out.println(Arrays.toString(reveredArray));
    }

    private static int[] getReversedArray(int[] array) {
        for(int i =0, j = array.length -1; i!=j || i>j; i++, j--) {
            int temp = array[i];
            array[i]= array[j];
            array[j]=temp;
        }
        return array;
    }
}
