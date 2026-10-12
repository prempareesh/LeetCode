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
    
      private HashMap<Integer, Integer> hm = new HashMap<>();
    // FIX: Move index here so it persists and increments across recursive calls
    private int preorderIndex = 0; 

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        
        // FIX: Use the class variable and increment it
        int rootval = preorder[preorderIndex++]; 
        int mid = hm.get(rootval);
        TreeNode root = new TreeNode(rootval);
        
        root.left = helper(preorder, left, mid - 1);
        root.right = helper(preorder, mid + 1, right);
        
        return root;
    }
}