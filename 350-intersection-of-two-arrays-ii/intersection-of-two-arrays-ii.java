import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Step 1: Count frequencies of elements in nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Find common elements with respect to counts
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.put(num, map.get(num) - 1); // Decrement count after matching
            }
        }
        
        // Step 3: Convert the list to a primitive array
        int[] ans = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            ans[i] = resultList.get(i);
        }
        
        return ans;
    }
}
