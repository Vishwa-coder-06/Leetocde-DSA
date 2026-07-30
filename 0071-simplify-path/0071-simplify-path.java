class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        String[] route=path.split("/");
        for(int i=0;i<route.length;i++){
            if(route[i].equals(".") || route[i].equals("")) continue;
            if(route[i].equals("..")){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(route[i]);   
            }
        }
        if(st.isEmpty())return "/";
        StringBuilder res=new StringBuilder();
        for(String str:st){
            res.append("/").append(str);
        }
        return res.toString();
    }
}