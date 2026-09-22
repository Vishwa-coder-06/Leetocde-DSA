class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        long pairs=0;
        for(int[] interval:intervals){
            int start=interval[0];
            int end=interval[1];
            while(!heap.isEmpty() && heap.peek()<start){
                heap.poll();
            }
            pairs+=heap.size();
            heap.offer(end);
        }
        return pairs;
        
    }
}