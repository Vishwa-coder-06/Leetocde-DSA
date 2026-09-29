class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int bitcount=Integer.bitCount(arr[i]);
            arr[i]+=bitcount*10001;//hence constraint is 0 <= arr[i] <= 10^4
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++) arr[i]%=10001;

        return arr;
    }
}