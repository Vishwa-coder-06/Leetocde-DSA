class Solution {
    int nextvalid(String str,int idx){
        int skip=0;
        while(idx>=0){
            if(str.charAt(idx)=='#'){
                skip++;
                idx--;
            }
            else if(skip>0){
                skip--;
                idx--;
            }
            else break;
        }
        return idx;
    }
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        while(i>=0 || j>=0){
            i=nextvalid(s,i);
            j=nextvalid(t,j);
            if(i<0 && j<0) return true;
            if(i<0 || j<0 || s.charAt(i) != t.charAt(j)) return false;

            i--;
            j--;
        }
        return true;
    }
}