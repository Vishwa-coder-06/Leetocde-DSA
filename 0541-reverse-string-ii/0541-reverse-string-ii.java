class Solution {
    public String reverseStr(String s, int k) {
         char [] chararr=s.toCharArray();
        int n=chararr.length;
        for(int i=0;i<n;i+=2*k){
            int l=i;
            int r=(i+k-1<n)?i+k-1:n-1;
        while(l<r){
            char temp=chararr[l];
            chararr[l]=chararr[r];
            chararr[r]=temp;
            l++;
            r--;
        }
        }
        return new String(chararr);
    }
}