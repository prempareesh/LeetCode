class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String>list=new ArrayList<>();
        if(nums == null && nums.length ==0){
            return list;
        }
        for(int i=0; i<nums.length; i++ ){
        int start=nums[i];
        while(i+1<nums.length && nums[i+1] == nums[i]+1){
            i++;
        }
        if(nums[i] == start){
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + nums[i]);
        }
        }
        return list;
    }
}