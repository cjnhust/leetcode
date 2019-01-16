//https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
class Solution {
    public String reverseString(String s) {
        if(s==null||s.length()==0||s.length()==1) return s;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length/2;i++){
            char temp = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = temp;
        }
        return new String(c);
    }
}
