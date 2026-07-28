class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int currmax=0;
        int currmin=0;
        int maxi=nums[0];
        int mini=nums[0];
        for(int i=0;i<nums.length;i++){
            currmax+=nums[i];
            maxi=Math.max(currmax,maxi);
            if(currmax<0)currmax=0;

            currmin+=nums[i];
            mini=Math.min(currmin,mini);
            if(currmin>0)currmin=0;
        }
        System.out.println(maxi+" "+mini);
        return Math.max(Math.abs(maxi),Math.abs(mini));
    }
}