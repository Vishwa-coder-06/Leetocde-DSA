class Solution {
    int subarray(int[] nums,int goal){
        if(goal<0)return 0;
        int l=0,r=0;
        int count=0;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return subarray(nums,goal)-subarray(nums,goal-1);
        
    }
}