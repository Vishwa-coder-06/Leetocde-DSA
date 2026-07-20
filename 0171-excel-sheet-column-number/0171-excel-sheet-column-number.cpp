class Solution {
public:
    int titleToNumber(string s) {
        int res=0;
        int j=0;
        for(int i=s.size()-1;i>=0;i--){
            long num=long(pow(26,j++))*(s[i]-64);
            res+=num;
        }
        return res;
    }
};