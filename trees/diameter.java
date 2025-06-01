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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res= new int[1];
        solved(root, res);
        return res[0];

        
    }
    public int solved(TreeNode root, int[] res) {
        if(root==null) return 0;
        int l=solved(root.left, res);
        int r= solved(root.right, res);
        res[0]= Math.max(res[0], l+r);
        return 1+Math.max(l,r);
    }
    
}