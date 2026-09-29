class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] hash=new int[26];
        for(int i=0;i<allowed.length();i++) hash[allowed.charAt(i)-'a']++;
        int count=0;
        for(String word:words){
            boolean allow=true;
            for(int i=0;i<word.length();i++){
                if(hash[word.charAt(i)-'a']==0){ 
                    allow=false;
                    break;
                }
            }
            if(allow)
             count++;
        }
        return count;
    }
}