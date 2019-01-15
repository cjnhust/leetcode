//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        if(nums==null||nums.length==0) return length;
        if(nums.length==1) return 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[length] = nums[i];
                nums[length+1] = nums[i+1];
                length++;
            }
        }
        if(length+1<=nums.length-1){
            nums[length+1] = nums[nums.length-1];
        }
        return length+1;
    }
}
