class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        unordered_map<char,int>freq;
        for(char c:stones) freq[c]++;
        int sum=0;
        for(char ch:jewels){
            sum+=freq[ch];
        }
        return sum;
    }
};