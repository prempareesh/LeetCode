class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int demo[]=new int [2 * nums.length];
        for(int i=0; i<n; i++){
        demo[i]=nums[i];
        demo[n+i]=nums[i];
        }
        return demo;
    }
}