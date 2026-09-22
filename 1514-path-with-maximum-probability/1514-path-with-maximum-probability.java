class Solution {
    static class pair{
        int node;
        double prob;
        pair(int node,double prob){
            this.node=node;
            this.prob=prob;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<pair>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double prob=succProb[i];
            graph.get(u).add(new pair(v,prob));
            graph.get(v).add(new pair(u,prob));
        }

        double[] maxProb=new double[n];
        maxProb[start_node]=1.0;

        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Double.compare(b.prob,a.prob));
        pq.offer(new pair(start_node,1.0));

        while(!pq.isEmpty()){
            pair curr=pq.poll();
            int node =curr.node;
            double prob=curr.prob;
            if(node == end_node) return prob;

            if(prob<maxProb[node])continue;

            for(pair neighbor:graph.get(node)){
                double newProb=prob*neighbor.prob;
                if(newProb>maxProb[neighbor.node]){
                    maxProb[neighbor.node]=newProb;
                    pq.offer(new pair(neighbor.node,newProb));
                }
            }
        }
        return 0.0;
        
    }
}