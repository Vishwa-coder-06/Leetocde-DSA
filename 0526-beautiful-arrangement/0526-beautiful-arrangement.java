class Solution {
    int count=0;
    void backtrack(int n,int posi,boolean[] visited){
        if(posi>n){
            count++;
            return;
        }
        for(int num=1;num<=n;num++){
            if(!visited[num] && (num%posi==0 || posi%num==0)){
                visited[num]=true;
                backtrack(n,posi+1,visited);
                visited[num]=false;
            }
        }
    }
    public int countArrangement(int n) {
        boolean[] visited=new boolean[n+1];
        backtrack(n,1,visited);
        return count;
        
    }
}