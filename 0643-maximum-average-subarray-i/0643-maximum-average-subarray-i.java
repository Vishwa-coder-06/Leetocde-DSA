class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
         sum+=nums[i];
        }
        int maxisum=sum;
        int start=0;
        int end=k-1;
        while(end<nums.length-1){
           sum+=nums[++end]-nums[start++];
           maxisum=Math.max(maxisum,sum);
        }
        return (double)maxisum/k;
        
    }
}