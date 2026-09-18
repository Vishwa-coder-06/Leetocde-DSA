
import java.math.BigInteger;
class Solution {
    boolean backtrack(String num,int idx,int count,BigInteger n1,BigInteger n2){
        if(idx==num.length())return count>=3;

        for(int i=idx;i<num.length();i++){
            if(num.charAt(idx)=='0' && i>idx) break;
            String currstr=num.substring(idx,i+1);
            BigInteger curr=new BigInteger(currstr);

            if(count>=2){
                BigInteger sum=n1.add(n2);
                if(curr.compareTo(sum)<0) continue;
                else if(curr.compareTo(sum)>0) break;
            }

            if(backtrack(num,i+1,count+1,n2,curr)) return true;
        }
        return false;
    }
    public boolean isAdditiveNumber(String num) {
        return backtrack(num,0,0,null,null);
    }
}