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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
       // ArrayList<Integer> currlevel=new ArrayList<>();
       double ans=0;
            for(int i=0; i<size; i++){
                TreeNode curr=queue.poll();
                ans+=curr.val;
              //  currlevel.add(curr.val);
                if(curr.left != null){
                    queue.offer(curr.left );
                }
                if(curr.right != null){
                    queue.offer(curr.right );

            }
        }
       // double new=ans/2;
        result.add(ans/size);
        }
        return result;
        
    }
}