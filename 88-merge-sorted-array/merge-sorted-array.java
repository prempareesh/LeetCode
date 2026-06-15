class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] mix = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                mix[k] = nums1[i];
                i++;
                k++;
            } else {
                mix[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m) {
            mix[k] = nums1[i];
            i++;
           k++;
        }

        while(j < n) {
            mix[k] = nums2[j];
            j++;
         k++;
        }

        for(int p = 0; p < mix.length; p++) {
            nums1[p] = mix[p];
           
        }
    }
}