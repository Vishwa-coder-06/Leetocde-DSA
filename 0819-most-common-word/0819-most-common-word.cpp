class Solution {
public:
    string mostCommonWord(string paragraph, vector<string>& banned) {
        unordered_set<string>bannedword(banned.begin(),banned.end());
        for(char& c:paragraph){
            if(isalpha(c)) c=tolower(c);
            else c=' ';
        }
        stringstream ss(paragraph);
        string word;
        unordered_map<string,int>mp;
        string res="";
        int maxfreq=0;
        while(ss >> word){
            if(bannedword.find(word)==bannedword.end()){
            mp[word]++;

            if(mp[word]>maxfreq){
                maxfreq=mp[word];
                res=word;
            }
          }
        }
        return res;
    }
};