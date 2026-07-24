class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int[]res=new int [n];
        int j=0;
        for(int i=0;i<n;i++){
            if(j<n){
                res[j++]=arr[i];
                if(arr[i]==0 && j<n) 
                  res[j++]=0;
            }
        }
        for(int i=0;i<n;i++)
           arr[i]=res[i];
    }
}