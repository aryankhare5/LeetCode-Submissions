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
    public TreeNode invertTree(TreeNode root) {
        
        solve(root);
        return root;
    }

    public void swap(TreeNode root){
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }

    public void solve(TreeNode a){
        if(a == null) return ;
        
        swap(a);
        solve(a.left);
        solve(a.right);
    }
}