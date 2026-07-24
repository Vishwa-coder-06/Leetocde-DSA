class Solution {
    public String reverse(String s,int l,int r){
        char [] chararr=s.toCharArray();
        while(l<r){
            char temp=chararr[l];
            chararr[l]=chararr[r];
            chararr[r]=temp;
            l++;
            r--;
        }
        return new String(chararr);
    }
    public String reverseStr(String s, int k) {
        int n=s.length();
        for(int i=0;i<n;i+=2*k){
            int left=i;
            int right=(i+k-1<n)?i+k-1:n-1;
            s=reverse(s,left,right);
        }
        return s;
    }
}