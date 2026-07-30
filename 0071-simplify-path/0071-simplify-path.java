class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String[] route=path.split("/");
        String res="";
        for(int i=0;i<route.length;i++){
            if(route[i].equals(".") || route[i].equals("")) continue;
            if(route[i].equals("..")){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(route[i]);   
            }
        }
        if(st.isEmpty())return "/";
        for(String str:st){
            res+="/"+str;
        }
        return res;
    }
}