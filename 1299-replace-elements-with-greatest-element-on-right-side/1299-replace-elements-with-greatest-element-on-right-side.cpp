class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n=arr.size();
        int currmax=-1;
        for(int i=n-1;i>=0;i--){
          int currvalue=arr[i];
          arr[i]=currmax;
          currmax=max(currmax,currvalue);
        }
        return arr;
    }
};