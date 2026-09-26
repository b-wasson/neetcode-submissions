class Solution {
    public int hammingWeight(int n) {

        int bitCount = 0;
      while(n != 0){
        n &= n - 1; 
        bitCount++; 
      }
        return bitCount; 
    }
}
