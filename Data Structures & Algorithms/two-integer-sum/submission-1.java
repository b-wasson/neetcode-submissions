class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++){
            //other number that i need 
            int otherIdxNum = target - nums[i];
            if(hash.containsKey(otherIdxNum)){
                return new int[] {hash.get(otherIdxNum), i};
            }
            
            hash.put(nums[i], i);
        }
        return new int[] {};
    }
}
