class Solution {
    static void choice(int i,int[] nums, ArrayList<Integer>sub, List<List<Integer>>res){
        //bc
        if(i==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        //take it
        sub.add(nums[i]);
        choice(i+1,nums, sub, res);
        // dont take it
        sub.remove(sub.size()-1);
        choice(i+1, nums, sub, res);
    } 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        choice(0, nums, new ArrayList<>(),res);
        return res;
    }
}