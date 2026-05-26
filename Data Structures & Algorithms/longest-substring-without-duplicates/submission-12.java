class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int counter = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);

            if(map.containsKey(c) && l <= i){
               l = Math.max(l, map.get(c) + 1);
            }

            map.put(c, i);

            maxLength = Math.max(maxLength, i - l + 1);
        }
        return maxLength;
    }
}
