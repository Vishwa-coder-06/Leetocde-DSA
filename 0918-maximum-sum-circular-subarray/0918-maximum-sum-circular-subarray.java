class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int totsum=0;
        int mincurr=0;
        int maxcurr=0;
        int minsum=nums[0];
        int maxsum=nums[0];

        for(int i=0;i<n;i++){
            mincurr+=nums[i];
            minsum=Math.min(minsum,mincurr);
            if(mincurr>0) mincurr=0;
             
            maxcurr+=nums[i];
            maxsum=Math.max(maxsum,maxcurr);
            if(maxcurr<0) maxcurr=0;

            totsum+=nums[i];
        }
        if(maxsum<0)return maxsum;

        return Math.max(maxsum,totsum-minsum);
    }
}