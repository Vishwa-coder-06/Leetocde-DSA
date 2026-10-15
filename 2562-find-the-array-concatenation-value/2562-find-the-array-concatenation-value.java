class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long conc=0;
        int l=0,r=nums.length-1;
        while(l<=r){
            if(l==r){
                conc+=nums[l];
                break;
            }
            String concat=""+nums[l]+nums[r];
            conc+=Long.parseLong(concat);
            l++;
            r--;
        }
        return conc;
    }
}