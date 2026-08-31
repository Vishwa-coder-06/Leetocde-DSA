class Solution {
    static final int MOD=1_000_000_007;
    long power(long base,long exp){
        long res=1;
        base%=MOD;
        while(exp>0){
            if(exp%2==1)res=(res*base)%MOD;
            base=(base*base)%MOD;
            exp/=2;
        }
        return res;
    }
    public int sumDecoded(long[] nums) {
        long sum=0;
        for(long num:nums){
            long width=num%10;
            long d=num/10;

            long temp=d;
            int totdigit=0;
            while(temp>0){
                totdigit++;
                temp/=10;
            }
            int remdigit=totdigit-(int)width;
            long divisor=1;
            for(int i=0;i<remdigit;i++) divisor*=10;
            long x=d/divisor;
            long y=d%divisor;
            long decoded=power(x,y);
            sum=(sum+decoded)%MOD;
        }
        return (int) sum;
    }
}