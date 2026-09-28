class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);//if n is alternate it give as full of 1bit
        return (x&(x+1))==0;//when (n & n+1) , if x if full of 1bit then it would be 0 lik(111 & 1000=0000)
    }
}