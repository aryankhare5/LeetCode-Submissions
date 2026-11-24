/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count =0;
    public int pathSum(TreeNode root, int target) {
        if(root==null) return 0;
        solve(root, 0, target);
        pathSum(root.left, target);
        pathSum(root.right, target);
        return count;
    }

    public void solve(TreeNode root, long sum, int target){
        if(root==null) return;
        sum += root.val;

        if(sum==target) count++;

        solve(root.left, sum, target);
        solve(root.right, sum, target);
    }
}