class Solution {
    public int[] buildArray(int[] nums) {
      int ans []= new int[nums.length];
          // int demo[] = new demo[nums.length];
        for(int i=0; i<nums.length; i++){
           int demo=nums[i];
      
            ans[i]=nums[demo];
        }
        return ans;
    }
}