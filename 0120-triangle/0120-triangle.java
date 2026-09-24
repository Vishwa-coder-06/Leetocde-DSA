class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();

        for(int row=n-2;row>=0;row--){
            List<Integer>currRow=triangle.get(row);
            List<Integer>nextRow=triangle.get(row+1);

            for(int col=0;col<=row;col++){
                int minBelow=Math.min(nextRow.get(col),nextRow.get(col+1));
                currRow.set(col,currRow.get(col)+minBelow);
            }
        }
        return triangle.get(0).get(0);
    }
}