class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] res=new int[n+1];
        int l=0,r=n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                 res[i]=l;
                 l++;
            }
            else if(s.charAt(i)=='D') {
                res[i]=r;
                r--;
            }
        }
        res[n]=l;
        return res;
    }
}