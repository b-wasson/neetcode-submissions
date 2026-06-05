class Solution {
    public int characterReplacement(String s, int k) {
        int longestLength = 0;
        int counter = 0;

        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (char c : set) {
            for(int l = 0; l < s.length() - 1; l++){
                counter = 0;

                if (s.charAt(l) != c) counter++;

                if (counter <= k) longestLength = Math.max(longestLength, 1);


                for(int r = l + 1; r < s.length(); r++){
                    if(c != s.charAt(r)){
                    counter++;
                    }

                    if(counter > k){
                        break;
                    }else{
                        longestLength = Math.max(longestLength, r - l + 1);  
                    }   
                }
            }
        }
        return longestLength; 
    }
}
