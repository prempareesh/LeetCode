class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0; j<t.length(); j++){
            if(!hm.containsKey(t.charAt(j)) || hm.get(t.charAt(j)) == 0){
                return false;
            }
            hm.put(t.charAt(j), hm.get(t.charAt(j)) - 1);
        }
        return true;
        
    }
}