class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int a=0,b=0;
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
            switch (ch){
                case "+" :
                 a=st.pop();
                 b=st.pop();
                st.push(b+a);
                break;
                case "-" :
                 a=st.pop();
                 b=st.pop();
                st.push(b-a);
                break;
                case "*" :
                 a=st.pop();
                 b=st.pop();
                st.push(b*a);
                break;
                case "/" :
                 a=st.pop();
                 b=st.pop();
                st.push(b/a);
                break;
                default : 
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}