class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int st=nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1)i++;
            if(st==nums[i])res.add(String.valueOf(st));
            else res.add(st+"->"+nums[i]);
        }
        return res;
    }
}