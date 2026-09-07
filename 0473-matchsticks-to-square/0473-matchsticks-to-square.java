class Solution {
    boolean backtrack(int i,int[] nums,int[] sides,int side){
        if(i<0){
           return true;
        }
        for(int j=0;j<4;j++){
            if(nums[i]+sides[j]<= side){
                sides[j]+=nums[i];
                if(backtrack(i-1,nums,sides,side)) return true;
                sides[j]-=nums[i];
            }
            if(sides[j]==0)break;
        }

        return false;

    }
    public boolean makesquare(int[] matchsticks) {
        int n=matchsticks.length;
        int sum=0,maxi=-1;
        for(int i=0;i<n;i++){
            sum+=matchsticks[i];
            maxi=Math.max(maxi,matchsticks[i]);
        }
        if(sum%4!=0)return false;
        int side=sum/4;
        if(maxi>side)return false;
        int[] sides=new int[4];
        Arrays.sort(matchsticks);
        return backtrack(n-1,matchsticks,sides,side);
    }
}