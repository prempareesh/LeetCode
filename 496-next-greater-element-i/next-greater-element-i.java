class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
         int ans[]=new int[arr1.length];
      for(int i=0; i<arr1.length; i++){
        ans[i] = -1;
        for(int j=0; j<arr2.length; j++){
          if(arr1[i] == arr2[j]){
            for(int k = j + 1; k < arr2.length; k++){
              if(arr2[k] > arr1[i]){
                ans[i] = arr2[k];
                break;
              }
            }
            break;
          }
        }
      }
       return ans;
    }
    
}