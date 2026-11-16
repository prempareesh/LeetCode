class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
      for(int s=0; s<nums.length; s++){
        int diff=0;
        for(int e=nums.length-1; e>=0; e--){
           if(s < e && nums[s] < nums[e]){
                diff=nums[e]-nums[s];
                max=Math.max(max,diff);
        }
        }
    }
    if(max ==0 ){
        return -1;
    }
    return max;
      }
}
