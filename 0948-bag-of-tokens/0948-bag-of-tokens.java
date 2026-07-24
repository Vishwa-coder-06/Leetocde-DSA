class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0,r=tokens.length-1;
        int point=0;
        while(l<r){
            if(tokens[l]<=power){
                point++;
                power-=tokens[l];
                l++;
            }
            else if(point>0){
                point--;
                power+=tokens[r];
                r--;
              }
            else break;
        }
        if(l==r && tokens[l]<=power)point++;
        return point;
    }
}