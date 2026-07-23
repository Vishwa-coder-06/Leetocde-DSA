class Solution {
public:
    bool areOccurrencesEqual(string s) {
        unordered_map<char,int>mp;
        for(char ch:s){
            mp[ch]++;
        }
        int freq=mp[s[0]];
        for(char ch:s){
            if(mp[ch]!=freq)return false;
        }
        return true;
    }
};