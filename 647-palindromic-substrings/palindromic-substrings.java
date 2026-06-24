class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count =0;
        for(int i=0; i<n; i++){
            count+=findpal(s,i,i);
            count+=findpal(s,i,i+1);
        }
        return count ;
    }
    private int findpal(String s, int i, int j){
         int count =0;
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            count ++;
            i--;
            j++;
        }
        return count;
    }
}