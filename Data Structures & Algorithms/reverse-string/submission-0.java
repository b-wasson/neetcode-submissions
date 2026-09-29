class Solution {
    public void reverseString(char[] s) {

        //char at start -> temp 
        //char the end -> start
        //temp -> end 
        //move in idx 

        int l = 0; 
        int r = s.length - 1; 
        
        while(r >= l){
            char c = s[l];
            s[l] = s[r];
            s[r] = c; 
            l++;
            r--; 
        }
        
    }
}