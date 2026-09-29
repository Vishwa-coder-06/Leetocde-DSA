class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>res=new ArrayList<>();
        int value=0;
        for(int num:nums){
            value=((value<<1)+num)%5;
            res.add(value==0);
        }   
        return res;     
    }
}