class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int num:nums){
            if(!st.add(num)){
                st.remove(num);
            }
        }
        return st.isEmpty();
    }
}