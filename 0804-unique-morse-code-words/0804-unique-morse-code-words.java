class Solution {
    public String getMorse(String word){
        String []morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String res="";
        for(int i=0;i<word.length();i++){
            res+=morse[word.charAt(i)-'a'];
        }
        return res;
    }
    public int uniqueMorseRepresentations(String[] words) {
       HashSet<String>st=new HashSet<>();
       for(int i=0;i<words.length;i++){
        st.add(getMorse(words[i]));
       } 
    return st.size(); 
        
    }
}