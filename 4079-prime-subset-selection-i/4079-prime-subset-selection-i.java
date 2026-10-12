class Solution {
    public List<Integer> maxPrimes(int n, int s) {

        boolean[] prime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            prime[i]=true;
        }
        for(int p=2;p*p <=n;p++){
            if(prime[p]){
                for(int i=p*p;i<=n;i+=p) prime[i]=false;
            }
        }
        List<Integer>res=new ArrayList<>();
        long currsum=0;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                if(currsum+i<=s){
                    res.add(i);
                    currsum+=i;
                }else break;
            }
        }
        return res;
    }
}