class Solution {
    int countsetbit(int num){
        int setbit=0;
            while(num!=0){
                num&=(num-1);
                setbit++;
            }
            return setbit;
    }
    public int countPrimeSetBits(int left, int right) {
        int[] prime={2,3,5,7,11,13,17,19};
        HashSet<Integer>st=new HashSet<>();
        for(int pr:prime) st.add(pr);
        int count=0;
        for(int i=left;i<=right;i++){
            if(st.contains(countsetbit(i))) count++;
        }
        return count;
    }
}