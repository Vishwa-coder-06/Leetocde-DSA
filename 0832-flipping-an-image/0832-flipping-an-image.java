class Solution {
    void revinv(int[] arr){
        int l=0,r=arr.length-1;
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r]==0?1:0;
            arr[r]=temp==0?1:0;
            l++;
            r--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] bits:image){
            revinv(bits);
        }
        return image;
    }
}