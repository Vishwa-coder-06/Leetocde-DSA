class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer>st=new Stack<>();
        int sum=0;
        for(String str:operations) {
            switch(str){
                case "+" :
                    int prev1=st.pop();
                    int prev2=st.pop();
                    st.push(prev2);
                    st.push(prev1);
                    st.push(prev1+prev2);
                    sum+=st.peek();
                    break;
                case "D":
                    int prev=st.peek();
                    st.push(prev*2);
                    sum+=st.peek();
                    break;
                case "C": 
                    sum-=st.peek();
                    st.pop();
                    break;
                default: 
                    st.push(Integer.parseInt(str));
                    sum+=st.peek();
                    break;
            }
        }
        return sum;
    }
}