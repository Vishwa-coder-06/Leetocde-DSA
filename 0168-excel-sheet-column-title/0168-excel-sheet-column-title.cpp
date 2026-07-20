class Solution {
public:
    string convertToTitle(int n) {
        string res="";
        while(n!=0){
            n=n-1;
            int d=n%26;
            res=(char)(d+65)+res;
            n/=26;
        }
        return res;
    }
};