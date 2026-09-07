class Solution {
    public int alternatingSubarray(int[] nums) {
        int r=1;
        int n=nums.length;
        int expected=1;
        int count=1;
        int maxi=-1;
        while(r<n){
            int diff=nums[r]-nums[r-1];
            if(diff==expected){
               count++;
               expected=-expected;
               maxi=Math.max(count,maxi);
            }
            else{
                if(diff==1){
                    count=2;
                    expected=-1;
                    maxi=Math.max(count,maxi);
                }
                else {
                    count=1;
                    expected=1;
                }
            }
            r++;
           
        }
        return maxi;
        
    }
}