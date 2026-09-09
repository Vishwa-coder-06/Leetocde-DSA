class Solution {
    int backtrack(int[] nums,int index,int currsum,int target){
        if(index == nums.length){
           return currsum==target?1:0;
        }
        int add=backtrack(nums,index+1,currsum+nums[index],target);
        int sub=backtrack(nums,index+1,currsum-nums[index],target);
        return add+sub;

    }
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums,0,0,target);
    }
}