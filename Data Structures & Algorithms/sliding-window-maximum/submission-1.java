class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int outputLength = nums.length - k + 1;
        int[] output = new int[outputLength];

        for(int i = 0; i < outputLength; i++){
            int currMax = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++){
                if(nums[j] > currMax) currMax = nums[j];
            }
            output[i] = currMax;
        }

        return output; 
    }
}
