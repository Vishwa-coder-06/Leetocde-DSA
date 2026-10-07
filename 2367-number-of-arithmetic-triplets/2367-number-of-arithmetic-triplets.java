class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] hash=new boolean[201];
        int count=0;
        for(int num:nums) hash[num]=true;

        for(int num:nums)
          if(num>=diff && hash[num-diff] && (num+diff<=200) && hash[num+diff]) count++;
        
        return count;
    }
}