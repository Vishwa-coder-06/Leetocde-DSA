class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int temp=n;
        int bitcnt=0;
        while(temp>0){
            bitcnt++;
            temp>>=1;
        }
        int mask=bitcnt==31?Integer.MAX_VALUE:(1<<bitcnt)-1;

        return n^mask;
        
    }
}