class Solution {
    boolean  ispalin(String str){
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l++)!=str.charAt(r--)) return false;   
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(ispalin(word)){
                return word;
            }
        }
        return "";
    }
}