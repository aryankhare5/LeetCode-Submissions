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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if (root==null) return ans;

        q.add(root);


        while(!q.isEmpty()){
            int size = q.size();
            int s = size;
            int i=0;
            while(size-- != 0){
                TreeNode t = q.poll();
                if(i==s-1){
                    ans.add(t.val);
                }

                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);

                i++;
            }
        }

        return ans;
    }
}