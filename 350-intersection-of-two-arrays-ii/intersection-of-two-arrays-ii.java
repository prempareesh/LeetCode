class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        for(int j=0; j<nums2.length; j++){
            if(hm.containsKey(nums2[j]) && hm.get(nums2[j])>0){
                list.add(nums2[j]);
            
             hm.put(nums2[j],hm.get(nums2[j])-1);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}