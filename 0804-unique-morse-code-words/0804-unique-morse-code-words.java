class Solution {
    public String getMorse(String word){
        String []morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder res=new StringBuilder() ;
        for(int i=0;i<word.length();i++){
            res.append(morse[word.charAt(i)-'a']);
        }
        return res.toString();
    }
    public int uniqueMorseRepresentations(String[] words) {
       HashSet<String>st=new HashSet<>();
       for(int i=0;i<words.length;i++){
        st.add(getMorse(words[i]));
       } 
    return st.size(); 
        
    }
}