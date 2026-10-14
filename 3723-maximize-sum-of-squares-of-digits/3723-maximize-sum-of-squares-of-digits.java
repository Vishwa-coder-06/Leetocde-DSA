class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum<0 || sum>num*9) return "";

        StringBuilder sb=new StringBuilder();
        int remainsum=sum;
        for(int i=0;i<num;i++){
            int remainpos=num-1-i;
            for(int j=9;j>=0;j--){
                if(remainsum-j <= remainpos*9 && remainsum-j>=0){
                    sb.append(j);
                    remainsum-=j;
                    break;
                }
            }
        }
        return sb.toString();
    }
}