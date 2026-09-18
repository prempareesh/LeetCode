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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
               boolean foundx=false;
                boolean foundy=false;
            for(int i=0; i<size; i++){
                TreeNode currnode=queue.poll();
                if(currnode.val == x) foundx=true;
                if(currnode.val == y) foundy=true;
            if(currnode.left != null && currnode.right!=null){ 
                if((currnode.left.val == x && currnode.right.val == y) || (currnode.left.val == y && currnode.right.val == x)){  return false;
        }
            }
        if(currnode.left != null)
        queue.offer(currnode.left);
        if (currnode.right != null)
        queue.offer(currnode.right);
    }
    if(foundx && foundy) return true;
        if(foundx || foundy) return false;
        }
return false;
    }
}