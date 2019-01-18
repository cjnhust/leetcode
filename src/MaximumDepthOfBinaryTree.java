/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        int lD=0,rD=0;
        if(root.left!=null) {
             lD = maxDepth(root.left);
        }
        if(root.right!=null){
             rD = maxDepth(root.right);
        }
        return Math.max(lD,rD)+1;
    }
}
