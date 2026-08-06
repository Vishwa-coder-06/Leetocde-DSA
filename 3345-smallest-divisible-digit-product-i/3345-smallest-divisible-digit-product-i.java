class Solution {
    static int digitproduct(int n){
        int pro=1;
        while(n!=0){
         pro*=(n%10);
         n/=10;
        }
        return pro;
    } 
    public int smallestNumber(int n, int t) {
        while(digitproduct(n)%t!=0){
            n++;
        }
        return n;
        
    }
}