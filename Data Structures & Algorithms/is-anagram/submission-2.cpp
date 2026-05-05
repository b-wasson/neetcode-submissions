class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != t.size()) return false; 
        unordered_map<char, int> thash;
        unordered_map<char, int> shash;
        for(int i = 0; i < s.size(); i++){
            shash[s[i]]++;
            thash[t[i]]++;
        }
        return thash == shash;
    }
};
