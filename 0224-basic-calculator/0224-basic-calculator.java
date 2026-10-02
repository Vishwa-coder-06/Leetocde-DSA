class Solution {
    public int calculate(String s) {
        Stack<Integer>st=new Stack<>();
        int res=0;
        int curr=0;
        int sign=1;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                curr=curr*10+(ch-'0');
            }
            else if(ch=='+'){
                res+=curr*sign;
                sign=1;
                curr=0;
            }
            else if(ch=='-'){
                res+=curr*sign;
                sign=-1;
                curr=0;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
                curr=0;
            }
            else if(ch==')'){
                res+=curr*sign;
                curr=0;
                res*=st.pop();
                res+=st.pop();
            }
        }
        res+=sign*curr;
        return res;
    }
}