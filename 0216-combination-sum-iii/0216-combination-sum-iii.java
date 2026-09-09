class Solution {
    List<List<Integer>>res=new ArrayList<>();
    void backtrack(int start,int target,int k,List<Integer>sub){
        if(k==0 && target==0){
            res.add(new ArrayList<>(sub));
            return;
        }
        if(k==0 || target<0)return;
        for(int i=start;i<=9;i++){
            sub.add(i);
            backtrack(i+1,target-i,k-1,sub);
            sub.remove(sub.size()-1);
        }

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1,n,k,new ArrayList<>());
        return res;
        
    }
}