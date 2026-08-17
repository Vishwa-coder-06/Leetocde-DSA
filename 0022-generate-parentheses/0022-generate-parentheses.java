class Solution {
    static void gen(int open,int close,int n,String paren,ArrayList<String> res){
    //bc 
    if(open == n && close == n) {
        res.add(paren);
        return ;
    }
    //call
    if(open<n)
    gen(open+1,close,n,paren+"(",res);
    if(open>close)
    gen(open,close+1,n,paren+")",res);
   }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<>();
        gen(0,0,n,"",res);
        return res;
    }
}

   