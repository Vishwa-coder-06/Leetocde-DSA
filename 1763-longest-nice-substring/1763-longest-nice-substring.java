class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2) return "";
        boolean[] lower=new boolean[26];
        boolean[] upper=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)) lower[ch-'a']=true;
            else upper[ch-'A']=true;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int idx=Character.toLowerCase(c)-'a';
            if(lower[idx]!=upper[idx]){
                String sub1=longestNiceSubstring(s.substring(0,i));
                String sub2=longestNiceSubstring(s.substring(i+1));

                return sub1.length()>=sub2.length()?sub1:sub2;
            }
        }
        return s;
        
    }
}