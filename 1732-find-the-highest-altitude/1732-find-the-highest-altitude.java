class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0;
        int maxi=0;
        for(int alti:gain){
            curr+=alti;
            maxi=Math.max(maxi,curr);
        }
        return maxi;
        
    }
}