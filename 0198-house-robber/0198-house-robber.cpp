class Solution {
public:
    int rob(vector<int>& nums) {
       int n=nums.size();
       if(n==1)return nums[0];
       if(n==2)return max(nums[0],nums[1]);
      
       int prev1=max(nums[0],nums[1]),prev2=nums[0];
       int total=prev1;

       for(int i=2;i<n;i++){
        total=max(nums[i]+prev2,prev1);
        prev2=prev1;
        prev1=total;
       }
       return total;
        
    }
};