class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,h=arr.length-1,peak=0;
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr[mid]<arr[mid+1]){
                peak=l=mid+1;
            }
            else h=mid;
            System.out.println(mid);
        }
        return peak;
    }
}