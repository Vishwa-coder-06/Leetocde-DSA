class Solution {
    public char repeatedCharacter(String s) {
        int[] hash=new int[26];
        char rep=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(hash[s.charAt(i)-'a']>0){
                rep=s.charAt(i);
                break;
            }
            hash[s.charAt(i)-'a']++;
        }
        return rep;
    }
}