class Solution {
    public int magicalString(int n) {
        if(n<=0)return 0;
        if(n<=3) return 1;
         int[] str=new int[n];
        str[0]=1;
        str[1]=2;
        str[2]=2;

        int l=2,r=3;
        int num=1,count=1;
        while(r<n){
            int freq=str[l];
            for(int k=0;k<freq && r<n;k++){
                str[r]=num;
                if(num==1) count++;
                r++;
            }
            l++;
            num=(num==1)?2:1;
        }
        return count;
        
    }
}