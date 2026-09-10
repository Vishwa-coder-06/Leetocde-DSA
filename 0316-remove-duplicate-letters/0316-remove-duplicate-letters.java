class Solution {
    public String removeDuplicateLetters(String s) {
         int[] lastidx=new int[26];
        boolean[]visited=new boolean[26];
        Stack<Character>st=new Stack<>();

        for(int i=0;i<s.length();i++){
            lastidx[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']) continue;

            while(!st.isEmpty() && st.peek()>ch && lastidx[st.peek()-'a']>i){
                char rem=st.pop();
                visited[rem-'a']=false;
            }

            st.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            System.out.println(c+" "+ st.peek());
            sb.append(c);

        }
        return sb.toString();
    }
}