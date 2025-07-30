// 543. Diameter of Binary Tree
//https://leetcode.com/problems/diameter-of-binary-tree/submissions/1717031877

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
    int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;

        findmax(root);
        return maxi;
    }
    private int findmax(TreeNode node)
    {
        if(node==null)
        return 0;

        int lh = findmax(node.left);
        int rh = findmax(node.right);

        maxi = Math.max(maxi,lh+rh);

        return Math.max(lh,rh)+1;
    }
}