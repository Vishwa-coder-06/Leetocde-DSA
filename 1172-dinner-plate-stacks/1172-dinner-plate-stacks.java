class DinnerPlates {
    int max=0;
    ArrayList<Stack<Integer>> arr;
    PriorityQueue<Integer> pq;
    public DinnerPlates(int capacity) {
        this.max=capacity;
        this.arr=new ArrayList<>();
        this .pq=new PriorityQueue<>();
    }
    
    public void push(int val) {
        while(!pq.isEmpty() && (pq.peek()>=arr.size() || arr.get(pq.peek()).size()==max)){
        pq.poll();
        }
        if(!pq.isEmpty()){
            int idx=pq.peek();
            arr.get(idx).push(val);
            if(arr.get(idx).size()==max) pq.poll();
        }
        else {
            int idx=arr.size()-1;
            if(!arr.isEmpty() && arr.get(idx).size()<max){
                arr.get(idx).push(val);
            }
            else{
                Stack<Integer>st=new Stack<>();
                st.push(val);
                arr.add(st);
               
            }
        }
        
    }
    
    public int pop() {
        while(!arr.isEmpty() && arr.get(arr.size()-1).isEmpty()) {
            arr.remove(arr.size()-1);
        }
        if(arr.isEmpty()) return -1;
        return popAtStack(arr.size()-1);
    }
    
    public int popAtStack(int index) {
        if(index<0 || index>=arr.size() || arr.get(index).isEmpty())
        return -1;
        
        int val=arr.get(index).pop();
        pq.offer(index);
        return val;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */