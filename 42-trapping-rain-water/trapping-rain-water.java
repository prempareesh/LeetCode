class Solution {
    public int trap(int[] height) {
        int i = 0, j = height.length - 1;
        int left_max = 0, right_max = 0;
        int water = 0;

        while (i < j) {
            left_max = Math.max(left_max, height[i]);
            right_max = Math.max(right_max, height[j]);

            if (left_max < right_max) {
                water += left_max - height[i];
                i++;
            } else {
                water += right_max - height[j];
                j--;
            }
        }

        return water;
    }
}