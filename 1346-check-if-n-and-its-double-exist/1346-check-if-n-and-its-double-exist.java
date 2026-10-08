class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i]*2) || (arr[i]%2 == 0 && st.contains(arr[i]/2))) return true;
            st.add(arr[i]);
        }
        return false;
    }
}