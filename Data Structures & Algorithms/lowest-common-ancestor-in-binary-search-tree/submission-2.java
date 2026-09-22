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
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) return null;
        while(node != null){
            if(node.val > p.val && node.val > q.val){
                node = node.left;
            }else if(node.val < p.val && node.val < q.val){
                node = node.right;
            }else{
                return node;
            }
        }
        return null;
    }
}
