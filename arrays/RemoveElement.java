package arrays;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int j = nums.length - 1;
        while(i<=j) {
            if(nums[i] == val && nums[j] == val){
                j--;
            }
            else if(nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else if(nums[j] == val) {
                j--;
            }
            else if(nums[i] != val && nums[j]!= val) {
                i++;
            }
        }
        return j+1;
    }
}