class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int first = -1;

        // 1. Find the FIRST occurrence (left boundary)
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                first = mid; // Save the found index
                end = mid;   // Keep shrinking from the right to find the first one
            }
        }

        // If target wasn't found at all, return [-1, -1] immediately
        if (first == -1) {
            return new int[]{-1, -1};
        }

        // Reset pointers to find the LAST occurrence (right boundary)
        start = first; 
        end = nums.length;
        int last = first;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                last = mid;      // Save the found index
                start = mid + 1; // Keep shrinking from the left to find the last one
            }
        }

        return new int[]{first, last};
    }
}
