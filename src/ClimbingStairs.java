//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/
class Solution {
    public int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int fn_2=1;
        int fn_1 =2;
        int fn=0;
        for(int i=3;i<=n;i++){
            fn=fn_2+fn_1;
            fn_2=fn_1;
            fn_1=fn;
        }
        return fn;
    }
}
