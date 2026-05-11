class Solution {
    public int maxArea(int[] heights) {
        int max = -1;
        int currHeight = 0;
        for(int i = 0; i < heights.length; i++){
            for(int j = 0; j < heights.length; j++){
                if(heights[i] < heights[j]){
                    currHeight = heights[i];
                }else { 
                    currHeight = heights[j];
                }
                
                if(currHeight * Math.abs(j - i) > max){
                    max = currHeight * Math.abs(j - i);
                }

            }
        }
        return max;
    }
}
