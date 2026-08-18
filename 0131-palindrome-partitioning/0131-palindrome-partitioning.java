class Solution {
    static boolean ispalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    static void backtrack(int start,String s,ArrayList<String> sub,List<List<String>> res){
        //BC
        if(start==s.length()){
            res.add(new ArrayList(sub));
            return;
        }

        for(int i=start;i<s.length();i++){
            if(ispalindrome(s,start,i)){
                sub.add(s.substring(start,i+1));

                backtrack(i+1,s,sub,res);

                sub.remove(sub.size()-1);
            }
        }


    }
    public List<List<String>> partition(String s) {
        List<List<String>>res =new ArrayList<>();
        backtrack(0,s,new ArrayList<>(),res);
        return res;
         
    }
}