class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
             int demo=0;
             int real=0;
            for(int j=0; j<=i; j++){
            
                 demo=nums[j];
                real=real + demo;
            }
            ans[i]=real;
        }
        return ans;
    }
}