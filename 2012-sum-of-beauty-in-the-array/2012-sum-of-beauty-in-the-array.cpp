class Solution {
public:
    int sumOfBeauties(vector<int>& nums) {
        int n=nums.size();
        vector<int>suffmin(n);
        suffmin[n-1]=nums[n-1];
        for(int i=n-2;i>0;i--){
            suffmin[i]=min(suffmin[i+1],nums[i]);
        }
        int maxtillnow=nums[0],sum=0;
        for(int i=1;i<n-1;i++){
            if(maxtillnow<nums[i] && nums[i]<suffmin[i+1])sum+=2;
            else if(nums[i-1] <nums[i] && nums[i]<nums[i+1]) sum+=1;

            maxtillnow=max(maxtillnow,nums[i]);
        }
        return sum;
    }
};