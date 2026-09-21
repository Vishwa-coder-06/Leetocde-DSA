class Solution {
    void rev(char[] arr,int left,int right) {
        while(left<right){
            char temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    }
    public String reverseWords(String s) {
        char[] chars=s.toCharArray();
        int start=0,n=chars.length;
        for(int end=0;end<=n;end++){
            if(end==n || chars[end]==' '){
                rev(chars,start,end-1);
                start=end+1;
            }
        }
        return new String(chars);
    }
}