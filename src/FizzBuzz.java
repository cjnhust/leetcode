//https://leetcode.com/explore/featured/card/top-interview-questions-easy/102/math/743/
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3!=0&&i%5!=0){
                result.add(String.valueOf(i));
                continue;
            }
            if(i%3==0&&i%5==0){
                result.add("FizzBuzz");
                continue;
            }
            if(i%3==0){
                result.add("Fizz");
                continue;
            }
            if(i%5==0){
                result.add("Buzz");
                continue;
            }


        }
        return result;
    }
}
