class Solution {
public:
    bool checkString(string s) {
        int c=0;
        for(int i=0;i<s.size();i++){
            if(s[i]>s[i+1])
            c++;
        }
        return (c<=1);
    }
};