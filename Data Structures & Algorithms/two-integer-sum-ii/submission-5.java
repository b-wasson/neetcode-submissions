class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        for(int j = 0; j < numbers.length; j++){

            for(int i = 0; i < numbers.length; i++){
                
                if(numbers[left] + numbers[right] == target && left < right){
                    return new int[]{left + 1, right + 1};
                }
                right--;
            }
            right = numbers.length - 1;
            left++;
        }
        int[] output = {};
        return output;
    }
}
