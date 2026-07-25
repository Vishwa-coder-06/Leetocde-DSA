class Solution {
    public static boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')return true;
        return false;
    }
    public int maxVowels(String s, int k) {
         int n=s.length();
         int vowelcount=0;
         int maxi=Integer.MIN_VALUE;
         int l=0,r=0;
         while(r<s.length()){
            if(r<k){
               if(isvowel(s.charAt(r))) vowelcount++;
               r++;
            }
            else{
                if(isvowel(s.charAt(l))) vowelcount--;
                l++;
                if(isvowel(s.charAt(r))) vowelcount++;
                r++;
            }
            System.out.println(vowelcount +" "+r+" "+l);
            maxi=Math.max(maxi,vowelcount);
         }
         return maxi;
    }
}