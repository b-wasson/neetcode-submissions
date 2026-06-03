class Solution {
    public int longestConsecutive(int[] nums) {

        int pastNum = Integer.MIN_VALUE;
        int counter = 1;
        int currLargestLength = 1;

        if(nums.length == 0) return 0;
   

        Arrays.sort(nums);

        for(int num : nums){
            if(pastNum == num) continue;
            if(pastNum + 1 == num){
                counter++;

                if(counter > currLargestLength) currLargestLength = counter; 

                pastNum = num;
                continue;
            }
            pastNum = num;
            counter = 1; 
        }


        return currLargestLength;
    }
}
