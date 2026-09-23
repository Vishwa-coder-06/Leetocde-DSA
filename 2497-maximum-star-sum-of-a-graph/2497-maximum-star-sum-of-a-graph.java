class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n=vals.length;
        HashMap<Integer,List<Integer>>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(i,new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(vals[v]>0) mp.get(u).add(vals[v]);
            if(vals[u]>0) mp.get(v).add(vals[u]);
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            List<Integer>neighbor=mp.get(i);
            Collections.sort(neighbor,Collections.reverseOrder());

            int currSum=vals[i];
            int limit=Math.min(k,neighbor.size());
            for(int j=0;j<limit;j++){
                currSum+=neighbor.get(j);
            }
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
        
    }
}