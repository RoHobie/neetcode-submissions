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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode node = root;
        TreeNode parent = null;
        while(node != null){
            parent = node;
            if(node.val <= val){
                node = node.right;
            }else{
                node = node.left;
            }
        }
        if(parent.val > val){
            parent.left = new TreeNode(val);
        }else{
            parent.right = new TreeNode(val);
        }
        return root;
    }
}