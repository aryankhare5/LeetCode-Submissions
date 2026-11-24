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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<preorder.length; i++){
            map.put(inorder[i], i);
        }
        return solve(preorder, map, 0, map.size()-1);

    }

    int i =0;
    public TreeNode solve(int[] preorder, HashMap<Integer, Integer> map, int s, int e){
        if(s>e) return null;
        int val = preorder[i++];
        TreeNode root = new TreeNode(val);
        root.left = solve(preorder, map, s, map.get(val)-1);
        root.right = solve(preorder, map, map.get(val)+1, e);
        return root;
    }
}