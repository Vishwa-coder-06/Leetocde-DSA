class Solution {
    public boolean check(String s,int[]charsFreq){
        int[] currfreq=new int [26];
        for(int i=0;i<s.length();i++){
            currfreq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(currfreq[i]!=0 && currfreq[i]>charsFreq[i])return false;
        }
        return true;

    }
    public int countCharacters(String[] words, String chars) {
        int[] charsFreq=new int [26];
        for(int i=0;i<chars.length();i++){
            charsFreq[chars.charAt(i)-'a']++;
        }
        int res=0;
        for(String word:words){
            if(check(word,charsFreq)) res+=word.length();
        }
        return res;
    }
}