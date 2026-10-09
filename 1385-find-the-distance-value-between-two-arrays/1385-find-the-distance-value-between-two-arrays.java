class Solution {
    boolean hasElement(int[] arr,int low,int high){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=low && arr[mid]<=high) return true;
            else if(arr[mid]<low) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int cnt=0;
        for(int num:arr1){
            if(!hasElement(arr2,num-d,num+d)) cnt++;
        }
        return cnt;
    }
}