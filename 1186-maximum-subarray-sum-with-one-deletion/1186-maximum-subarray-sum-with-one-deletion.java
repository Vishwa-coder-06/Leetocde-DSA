class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int ondelete=arr[0];
        int maxi=arr[0];


        for(int i=1;i<arr.length;i++){
            int prevdelete=nodelete;

            nodelete=Math.max(nodelete+arr[i],arr[i]);
            ondelete=Math.max(ondelete+arr[i],prevdelete);
            maxi=Math.max(maxi,Math.max(ondelete,nodelete));

        }
        return maxi;
    }
}