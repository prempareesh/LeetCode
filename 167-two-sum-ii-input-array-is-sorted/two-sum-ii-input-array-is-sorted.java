class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length-1;
        int sum=0;
        int i=0;
        int j=n;
        while(j != 0 || i!=n){ 
        sum=numbers[i]+numbers[j];
        if(sum == target){
            return new int[]{i+1,j+1};
        } else if (sum > target){
            j--;
        } else {
            i++;
        }
        }
         return new int[]{-1,-1};
    }
}
