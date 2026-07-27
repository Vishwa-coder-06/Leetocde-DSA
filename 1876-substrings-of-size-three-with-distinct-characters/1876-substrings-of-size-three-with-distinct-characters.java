class Solution {
    public int countGoodSubstrings(String s) {
        int l=0,r=0;
        int count=0;
        while(r<s.length()){
            if(r-l+1==3){
                if(s.charAt(l)!=s.charAt(l+1) && s.charAt(l+1)!=s.charAt(l+2) && s.charAt(l)!=s.charAt(l+2))
                count++;

                l++;
            }
            r++;
        }
        return count;

    }
}