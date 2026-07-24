class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0,r=people.length-1;
        Arrays.sort(people);
        int cnt=0;
        while(l<r){
           if(people[l]+people[r]>limit){
                cnt++;
                r--;
            }
            else{
                cnt++;
                r--;
                l++;
            }
            if(l==r) cnt++;
        }
        return cnt;
    }
}