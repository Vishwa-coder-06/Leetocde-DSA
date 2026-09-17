class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi=Integer.MIN_VALUE;
        for(int candy:candies)
        maxi=Math.max(maxi,candy);
        List<Boolean>ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
           ans.add(candies[i]+extraCandies>=maxi?true:false);
        }
        return ans;
    }
}