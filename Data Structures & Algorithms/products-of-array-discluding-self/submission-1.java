class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        int[] numZeros = checkNumOfZeros(nums);
       
        if(numZeros[0] > 1){
            int[] output = new int[nums.length];
            return output;
        } else if (numZeros[0] == 1){
           nums = productExceptSelfOneZero(nums, numZeros[1]);
           return nums;
        }

        int product = 1;
        for(int num : nums){
            product *= num;
        }
     
        for(int i = 0; i < nums.length; i++){
            int div = nums[i];
            if(div == 0){
                div = 1;
            }
            nums[i] = product / div;
        }
        return nums;
    }

    //returns array of with first number of zeros and second value being the index of the first zero
    public int[] checkNumOfZeros(int[] nums){
        int zeroCount = 0;
        int firstZeroIndex = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
                firstZeroIndex = i;
            }
        }
        int[] output = {zeroCount, firstZeroIndex};
        return output;
    }

   public int[] productExceptSelfOneZero(int[] nums, int zeroIndex){
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            if(i != zeroIndex){
                product *= nums[i];
            }
        }
        int[] output = new int[nums.length];
        output[zeroIndex] = product;
        return output;
   }
}  
