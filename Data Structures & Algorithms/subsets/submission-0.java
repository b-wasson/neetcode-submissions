class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       //bitmask solution

       int numSubsets = (int) Math.pow(2, nums.length);
        List<List<Integer>> output = new ArrayList<>();

       for(int mask = 0; mask < numSubsets; mask++){

        List<Integer> currSubset = new ArrayList<>(); 

         for(int i = 0; i < nums.length; i++){
            if((mask & (1 << i)) != 0){
                currSubset.add(nums[i]);
            }
         }
        output.add(currSubset);
       }
        return output;
    }
}
