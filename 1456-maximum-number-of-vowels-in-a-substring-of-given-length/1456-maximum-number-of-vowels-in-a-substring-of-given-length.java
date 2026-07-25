class Solution {
    public static boolean isvowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
        
    }
    public int maxVowels(String s, int k) {
         int n=s.length();
         int vowelcount=0;
         for(int i=0;i<k;i++){
               if(isvowel(s.charAt(i))) vowelcount++;
         }
         int maxi=vowelcount;
         if(maxi==k)return k;

         for(int i=k;i<n;i++){
                if(isvowel(s.charAt(i-k))) vowelcount--;
                if(isvowel(s.charAt(i))) vowelcount++;

            maxi=Math.max(maxi,vowelcount);
            if(maxi==k)return k;
         }
         return maxi;
    }
}