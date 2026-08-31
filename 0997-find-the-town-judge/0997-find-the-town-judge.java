class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustarr= new int[n+1];
        for(int[] relation:trust){
            int a=relation[0];
            int b=relation[1];
            trustarr[a]--;
            trustarr[b]++;
        }
        for(int i=1;i<=n;i++)
        if(trustarr[i]==n-1)return i;
        
        return -1;
    }
}