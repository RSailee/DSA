package arrays;

public class LargestElementInArray {

    public static void main(String[] args) {
        int [] arr = new int[] {12, 15, 2, 9, 5};

        int largestNum = getLargestNumber(arr);

        System.out.println(largestNum);
    }

    private static int getLargestNumber(int[] arr) {
        int tempMax = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]> tempMax)
                tempMax = arr[i];
        }
        return tempMax;
    }


}
