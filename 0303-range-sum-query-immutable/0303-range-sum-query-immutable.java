class NumArray {
    int [] prefix;
    public NumArray(int[] nums) {
        int n=nums.length;
        prefix=new int [n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prefix[i]=sum;
            
        }
    }
    
    public int sumRange(int left, int right) {
    return (left==0)?prefix[right]:prefix[right]-prefix[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */