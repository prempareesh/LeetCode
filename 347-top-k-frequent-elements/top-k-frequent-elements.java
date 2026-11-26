class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer> [] list=new ArrayList[nums.length+1];

        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int key : hm.keySet() ){
        int frequency = hm.get(key);
        if(list[frequency] == null){
            list[frequency]=new ArrayList<>();
        }
         list[frequency].add(key);
        }
        int arr[]=new int [k];
        int counter=0;
        for(int i=list.length-1; i>=0 && counter<k; i--){
            if(list[i] != null){
                for (int j = 0; j < list[i].size() && counter < k; j++) {
                    arr[counter++] = list[i].get(j); // Changed 'counter' to 'count' and extracted element
                }
            }
          
        }
        return arr;
        
    }
}