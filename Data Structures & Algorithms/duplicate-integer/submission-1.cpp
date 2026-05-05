class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int currValue; 
        for(int i = 0; i < nums.size(); i++){
            currValue = nums[i];
            for(int j = 0; j < nums.size(); j++){
                if(currValue == nums[j] && i != j){
                    return true;
                }

            }

        }
        return false;
    }
};