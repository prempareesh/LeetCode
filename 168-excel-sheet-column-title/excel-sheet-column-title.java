class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb =new StringBuilder();
        while(n>0){
            n--;
            int charr=n%26;
            sb.append((char)('A'+charr));
            n=n/26;
        }
        return sb.reverse().toString();
    }
}