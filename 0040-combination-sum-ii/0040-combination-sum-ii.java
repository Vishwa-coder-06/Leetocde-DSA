class Solution {
    void choice(int start, int target, int[] arr,ArrayList<Integer>sub,List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(arr[i]>target) break;
            if(i>start && arr[i]==arr[i-1])continue;
            sub.add(arr[i]);
            choice(i+1,target-arr[i],arr,sub,res);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(candidates);
        choice(0,target,candidates,new ArrayList<>(),res);
        return res;
    }
}