class Solution {
    public int longestOnes(int[] nums, int k){
        int count=0;
        int i=0;
        int n=nums.length;
        for(int j=0; j<n; j++){
            if(nums[j] == 0){
                count++;
            } 
            if(count > k){
                if(nums[i] == 0){
                    count--;
                }
                i++;
            }
        }
        return n-i;

    }
}