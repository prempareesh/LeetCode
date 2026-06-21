class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int n=height.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int heights=Math.min(height[i],height[j]);
            int width=j-i;
            int area=heights*width;
            maxarea=Math.max(maxarea,area);
        if(height[i]<=height[j]){
            i++;
        } else {
            j--;
        }
        }
         return maxarea;
    }
}