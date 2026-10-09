class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int i=0;
        for(String word:words){
            for(int j=0;j<word.length();j++){
                if(i==s.length() || s.charAt(i) !=word.charAt(j)) return false;

                i++;
            }
            if(i==s.length()) return true;
        }
        
        return i==s.length();
    }
}