class Solution {
    static void gen(int open,int close,int n,StringBuilder paren,ArrayList<String> res){
    //bc 
    if(paren.length() == n*2) {
        res.add(paren.toString());
        return ;
    }
    //call
    if(open<n){
        paren.append("(");
        gen(open+1,close,n,paren,res);
        paren.deleteCharAt(paren.length()-1);
    }
    if(open>close){
        paren.append(")");
        gen(open,close+1,n,paren,res);
        paren.deleteCharAt(paren.length()-1);
   }
}

    public List<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<>();
        gen(0,0,n,new StringBuilder(),res);
        return res;
    }
}

   