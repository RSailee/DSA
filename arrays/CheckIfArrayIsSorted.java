package arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int [] sortedArr = new int[] {1, 2, 2, 4};
        int [] unSortedArray = new int[] {12, 15, 2, 19, 5};

        var isSorted1 = isArraySorted(sortedArr);
        var isSorted2 = isArraySorted(unSortedArray);

        System.out.println(isSorted1);
        System.out.println(isSorted2);

    }

    private static boolean isArraySorted(int[] arr) {
        for(int i = 0, j = i+1; i<arr.length && j <arr.length - 1; i++, j++) {
            if(arr[j]>=arr[i]);
            else
                return false;
        }
        return true;
    }
}
