class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;
        for(int num:nums) tot+=num;

        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            if(leftsum==tot-leftsum-nums[i]) return i;

            leftsum+=nums[i];
        }
        return -1;
        
    }
}