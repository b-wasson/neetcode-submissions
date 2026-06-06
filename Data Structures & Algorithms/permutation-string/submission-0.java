    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            HashMap<Character, Integer> freqTable = new HashMap<>(); 

            for(int i = 0; i < s1.length(); i++){
                freqTable.put(s1.charAt(i), (freqTable.getOrDefault(s1.charAt(i), 0)) + 1);
            }

            int need = freqTable.size();
            for(int i = 0; i < s2.length(); i++){
                HashMap<Character, Integer> count2 = new HashMap<>();
                int curr = 0; 
                for(int j = i; j < s2.length(); j++){
                    char c = s2.charAt(j);
                    count2.put(c, count2.getOrDefault(c, 0) + 1);

                    if(freqTable.getOrDefault(c, 0) < count2.get(c)){
                        break;
                    }

                    if(freqTable.getOrDefault(c, 0) == count2.get(c)){
                        curr++;
                    }

                    if(curr == need){
                        return true;
                    }

                }
            }
            return false;
        }
    }
