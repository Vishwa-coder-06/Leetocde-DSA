class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXor=0;
        int mask=0;
        for(int i=31;i>=0;i--){
            mask |=(1<<i);
            Set<Integer>prefix=new HashSet<>();
            for(int num:nums) prefix.add(num & mask);

            int xor=maxXor | (1 << i);

            for(int pre:prefix){
                if(prefix.contains(pre^xor)){
                    maxXor=xor;
                    break;
                }
            }
        }
        return maxXor;
    }
}