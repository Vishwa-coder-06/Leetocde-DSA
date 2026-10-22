class Solution {
public:
    void rev(string& word,int l,int r){
        while(l<r){
            char temp=word[l];
            word[l]=word[r];
            word[r]=temp;
            l++;
            r--;
        }
    }
    string reversePrefix(string word, char ch) {
        int r=0;
        while(r<word.size()){
            if(word[r]==ch){
                rev(word,0,r);
                break;
            }
            r++;
        }
        return word;
    }
};