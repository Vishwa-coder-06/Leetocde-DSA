class Solution {
    void solve(int index,String digits,String[] str,StringBuilder curr,List<String>res){
        if(index==digits.length()){
            res.add(curr.toString());
            return;
        }
        int num=digits.charAt(index)-'0';
        String letters=str[num];
        for(int i=0;i<letters.length();i++){
            curr.append(letters.charAt(i));
            solve(index+1,digits,str,curr,res);
            curr.deleteCharAt(curr.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
        if(digits.isEmpty())return res;       
        String[] str={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(0,digits,str,new StringBuilder(),res);
        return res;
        


        
    }
}