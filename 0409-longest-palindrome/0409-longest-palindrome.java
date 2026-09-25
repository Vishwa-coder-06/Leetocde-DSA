class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }   
        int length=0;
        boolean odd=false;
        for(int count:map.values()){
            length+=(count/2)*2;
            if(count%2!=0) odd=true;
        } 
        if(odd) length+=1;
        return length;
    }
}