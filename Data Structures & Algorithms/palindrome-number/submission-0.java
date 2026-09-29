class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false; 

        String stringX = String.valueOf(x);
        char[] arrX = stringX.toCharArray(); 
        int l = 0; 
        int r = arrX.length - 1;

        while(l <= r){
            if(arrX[r] != arrX[l]) return false;
            r--;
            l++;
        }

        return true; 
    }
}