class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0;
        boolean onedel=false;
        int maxi=Integer.MIN_VALUE;
        int count=0;
        while(r<nums.length){
            if(nums[r]==1){
                count++;
                r++;
            }
            else {
                if(onedel==false){
                onedel=true;
                r++;
                }
                else {
                    while(nums[l]!=0){
                        if(nums[l]==1)count--;
                        l++;
                    }
                    l++;
                    onedel=false;
                }
            }
        maxi=Math.max(maxi,count);
        }
        if(onedel==false)
        maxi--;
        return maxi;
    }
}