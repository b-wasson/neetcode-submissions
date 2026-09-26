class Solution {
    public int[] countBits(int n) {
        int curr = n;
        int[] output = new int[n + 1];
        while(n != 0){ 
            int count = 0;
            curr = n;
            while(curr != 0){
                curr &= curr - 1; 
                count++;
            }
            output[n] = count; 
            n--; 
        }

        return output; 
    }
}
