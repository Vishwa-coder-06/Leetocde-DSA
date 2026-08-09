class Solution {
    public double findpow(double x,int n){
        if(n==0)return 1;
        if(n==1)return x;
        double power=findpow(x,n/2);
        if(n%2!=0)return power*power*x;
        else return power*power;
    }
    public double myPow(double x, int n) {
        if(n<0)return (1/findpow(x,n));
        return findpow(x,n);
    }
}