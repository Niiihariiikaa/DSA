//LEETCODE 104


import javax.swing.tree.TreeNode;

public class Maxdepth {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }

        int LeftDepth= maxDepth(root.left);

        int rightDepth= maxDepth(root.right);

        return Math.max(LeftDepth, rightDepth) +1;
        
    }
    
}
