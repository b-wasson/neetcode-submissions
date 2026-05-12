class Solution {
    public int search(int[] nums, int target) {
        return binaryS(nums, target, 0, nums.length - 1);
    }

    public int binaryS(int[] nums, int target, int left, int right){
        int middle = -1; 
        while(left <= right){
            middle = (left + right) / 2;

            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                return binaryS(nums, target, left, middle - 1);
            }else{
                return binaryS(nums, target, middle + 1, right);
                
            }
        }
        return -1;
    }
}
