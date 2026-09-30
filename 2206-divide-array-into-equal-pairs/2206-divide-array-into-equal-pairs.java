class Solution {
    public boolean divideArray(int[] nums) {
        int[] hash=new int[501];
        for(int num:nums) hash[num]++;
        for(int freq:hash){
            if(freq%2==1) return false;
        }
        return true;
    }
}