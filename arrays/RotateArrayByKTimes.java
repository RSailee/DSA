package arrays;

import java.util.Arrays;

public class RotateArrayByKTimes {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5};

        int [] rotateArrayByOne = rotateArrayByKTimes(array, 13 );

        System.out.println(Arrays.toString(rotateArrayByOne));

    }

    private static int[] rotateArrayByKTimes(int[] array, int k) {
        int n = array.length;
        int rotation = k % n;
        int [] temp = new int [rotation];
        for(int i =0; i<rotation; i++) {
            temp[i] = array[i];
        }
        for(int i = rotation; i< n; i++) {
            array[i-rotation]= array[i];
        }
        for(int i = n - rotation; i< n; i++) {
            array[i] = temp[i-(n-rotation)];
        }
        return array;
    }
}
