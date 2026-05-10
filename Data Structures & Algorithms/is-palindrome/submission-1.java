class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
       int right = s.length() - 1;
       
       for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(right) && i < right){
                return false;
            }
            right--;
            if(i > right) return true;
       }
       
       return true;
    }
}
