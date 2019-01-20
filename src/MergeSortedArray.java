//https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null||nums2==null) return;
        int p1=0;
        int p2=0;
        int p=0;
        int[] nums = new int[m+n];
        while(p1<m&&p2<n){
            if(nums1[p1]<nums2[p2]){
                nums[p]=nums1[p1];
                p++;
                p1++;
            }else{
                nums[p]=nums2[p2];
                p++;
                p2++;
            }
        }
        while(p1<m){
            nums[p]=nums1[p1];
            p++;
            p1++;
        }
        while(p2<n){
            nums[p]=nums2[p2];
            p++;
            p2++;
        }
        for(int i=0;i<m+n;i++){
            nums1[i] = nums[i];
        }
    }
}
