class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        unordered_map<int,int>mp;
        for(auto it:target){
            mp[it]++;
        }
         for(auto it:arr){
            mp[it]--;
        }
        for(int i=0;i<arr.size();i++){
             if(mp[arr[i]]!=0)return false;
        }
        return true;
    }
};