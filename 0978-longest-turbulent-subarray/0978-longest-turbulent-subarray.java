class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l=0;
        int maxlen=1;
        Boolean less=null;
       for(int r=1;r<arr.length;r++){
           if(arr[r]>arr[r-1]){
            if(less==null || less)
            less=false;
            else l=r-1;
           }
           else if(arr[r]<arr[r-1]){
            if(less == null || !less)
            less=true;
            else l=r-1;
           }
        else{
            l=r;
            less=null;
        }

        maxlen=Math.max(maxlen,r-l+1);
    }
        return maxlen;
        
    }
}