class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int ot=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(ot>0)
                res+=s.charAt(i);

                ot++;
            }
            else{
                ot--;
                if(ot>0)
                res+=s.charAt(i);
            }
        }
        
        return res;
    }
}