class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int ans=-1;
        int l=0,r=1;
        while(r<nums.size()){
            if(nums[l]<nums[r]) ans=max(ans,nums[r]-nums[l]);
            else l=r;
            r++;
        }
      return ans;
    }
};