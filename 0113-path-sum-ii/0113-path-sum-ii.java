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
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        solve(root, target, ans, list, sum);
        return ans;
    }

    public void solve(TreeNode root, int target, List<List<Integer>> ans, List<Integer> list, int sum){
        
        if(root == null) return;
        list.add(root.val);
        sum+= root.val;
        
        if(root.left==null && root.right==null){
            if(sum==target) ans.add(new ArrayList<>(list));
        }else{
            solve(root.left, target, ans, list, sum);
            solve(root.right, target, ans, list, sum);
        }

        list.remove(list.size()-1);
        
    }
}