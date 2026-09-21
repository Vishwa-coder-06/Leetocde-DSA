class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res=new ArrayList<>();
        if(num == null || num.length()==0) return res;

        backtrack(res,num,target,0,"",0,0);
        return res;
    }
    void backtrack(List<String>res,String num,int target,int index,String path,long eval,long prev){
        if(index == num.length()){
            if(eval==target) res.add(path);
            return;
        }
        for(int i=index;i<num.length();i++){
            if(i!=index && num.charAt(index)=='0') break;

            String currStr=num.substring(index,i+1);
            long curr=Long.parseLong(currStr);
            if(index==0){
                backtrack(res,num,target,i+1,currStr,curr,curr);
            }
            else {
                backtrack(res,num,target,i+1,path+"+"+currStr,eval+curr,curr);
                backtrack(res,num,target,i+1,path+"-"+currStr,eval-curr,-curr);
                backtrack(res,num,target,i+1,path+"*"+currStr,(eval-prev)+(prev*curr),prev*curr);
            }
        }
    }
}