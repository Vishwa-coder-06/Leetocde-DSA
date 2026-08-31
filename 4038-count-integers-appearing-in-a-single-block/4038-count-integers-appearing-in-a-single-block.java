class Solution {
    public int countSpecialIntegers(int[] nums) {
       Map<Integer,Integer> freq=new HashMap<>();
       for(int num:nums) freq.put(num,freq.getOrDefault(num,0)+1);

        int count=0;
        int n=nums.length;
        int i=0;
        while(i<n){
            int j=i;
            while(j<n && nums[j]==nums[i]) j++;
            int block=j-i;
            if(block==freq.get(nums[i])) count++;

            i=j;
        }
        return count;
    }
}