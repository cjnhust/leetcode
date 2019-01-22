//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/880/
class Solution {
    public int reverse(int x) {
        boolean isNegative = x<0?true:false;
        String s = String.valueOf(Math.abs(x));
        char[] c = s.toCharArray();
        for(int i=0;i<c.length/2;i++){
            char temp = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = temp;
        }
        int temp ;
        try{
             temp = Integer.parseInt(new String(c));
        }catch(Exception e){
            return 0;
        }
        if(isNegative) return -temp;
        else return temp;
    }
}
