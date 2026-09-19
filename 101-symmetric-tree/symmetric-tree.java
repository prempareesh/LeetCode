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
    public boolean isSymmetric(TreeNode root) {
        if(root == null || root.left == null && root.right == null ){
            return true;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
        int size=queue.size();
        for(int i=0; i<size; i++){
           TreeNode lefto=queue.poll();
           TreeNode righto=queue.poll();
           if(lefto == null && righto==null){
            continue;
           }
           if(lefto == null || righto==null || lefto.val!=righto.val)
           return false;
           queue.offer(lefto.left);
            queue.offer(righto.right);
             queue.offer(lefto.right);
              queue.offer(righto.left);
           }
        }
        return true;
    }
}