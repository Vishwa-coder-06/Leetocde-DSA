class Solution {
    ArrayList<String> readBinaryWatch(int turnedOn) {
        ArrayList<String>res=new ArrayList<>();

        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn)
                res.add(new String(h+":"+(m<10?"0"+m:m)));
            }
        }
        return res;
    }
};