class Solution {
    static void choice(int i, int target, int[] arr,ArrayList<Integer>sub,List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(sub));
            return;
        }
        if(target < 0 || i==arr.length) return;

        sub.add(arr[i]);
        choice(i,target-arr[i],arr,sub,res);
        sub.remove(sub.size()-1);

        choice(i+1,target,arr,sub,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        choice(0,target,candidates,new ArrayList<>(),res);
        return res;
        
    }
}