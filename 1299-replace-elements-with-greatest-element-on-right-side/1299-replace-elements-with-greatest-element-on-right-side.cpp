class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n=arr.size();
        vector<int>res(n);
        int currmax=-1;
        for(int i=n-1;i>=0;i--){
          int currvalue=arr[i];
          res[i]=currmax;
          currmax=max(currmax,currvalue);
        }
        return res;
    }
};