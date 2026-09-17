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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root == null){
          return list;
        }
       Deque<TreeNode>queue=new LinkedList<>();
     queue.offer(root);
      boolean reverse=false;
       while(!queue.isEmpty()){
        int size =queue.size();
         ArrayList<Integer>currlevel=new ArrayList<>();
        for(int i=0; i<size;i++){
       if(!reverse){
            TreeNode currnroot=queue.pollFirst();
            currlevel.add(currnroot.val);
            if(currnroot.left!=null){
                queue.offerLast(currnroot.left);
            }
             if(currnroot.right!=null){
                queue.offerLast(currnroot.right);
             }
       } else {
             TreeNode currnroot=queue.pollLast();
           currlevel.add(currnroot.val);
             if(currnroot.right!=null){
                queue.offerFirst(currnroot.right);
             }
             if(currnroot.left!=null){
                queue.offerFirst(currnroot.left);
            }
        
       
        }
        }
        
        reverse=!reverse;
    list.add(currlevel);

       }
return list;
}
}
    