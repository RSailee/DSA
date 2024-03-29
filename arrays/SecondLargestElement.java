package arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int [] arr = new int[] {12, 15, 2, 19, 5};

        int secondLargestElement = getSecondLargestElement(arr);

        System.out.println(secondLargestElement);
    }

    private static int getSecondLargestElement(int[] arr) {
        int max = arr[0];
        int secondMax = max;
        for(int i =0; i< arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }
}
