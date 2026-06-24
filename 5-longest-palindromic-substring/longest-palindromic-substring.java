class Solution {
    public String longestPalindrome(String s) {
        int st=0;
        int e=0;
        int n=s.length();
        for(int i=0; i<n; i++){
            int len1=findlen(s,i,i);
            int len2=findlen(s,i,i+1);
            int length=Math.max(len1,len2);
            if(length>(e-st)){
            st=i-(length-1)/2;
            e=i+length /2;
        }
    }
    return s.substring(st,e+1);
    }
        private int findlen(String s, int l, int r){
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                
                
                l--;
                r++;
            }
            return r-l-1;
        }
    }

