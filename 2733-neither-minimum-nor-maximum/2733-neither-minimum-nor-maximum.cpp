class Solution {
public:
    int findNonMinOrMax(vector<int>& nums) {
        int mini=INT_MAX;
        int maxi=INT_MIN;
        for(auto it:nums){
            mini=min(mini,it);
            maxi=max(maxi,it);
        }
        for(auto it:nums){
            if(it !=maxi && it!=mini)return it;
        }
        return -1;
    }
};