class Solution {
    public int longestConsecutive(int[] nums) {

        int pastNum = Integer.MIN_VALUE;
        int counter = 1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int currLargestLength = 1;
        List<Integer> currRun = new ArrayList<>();

        if(nums.length == 0) return 0;
   

        Arrays.sort(nums);

        for(int num : nums){
            if(pastNum == num) continue;
            if(pastNum + 1 == num){
                counter++;

                if(counter > currLargestLength) currLargestLength = counter; 

                currRun.add(num);
                pastNum = num;
                continue;
            }
            map.put((Integer) counter, currRun);
            pastNum = num;
            counter = 1; 
        }


        return currLargestLength;
    }
}
