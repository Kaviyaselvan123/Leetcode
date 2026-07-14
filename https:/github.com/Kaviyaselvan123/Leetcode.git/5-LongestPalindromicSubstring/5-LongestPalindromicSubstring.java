// Last updated: 7/14/2026, 2:06:35 PM
class Solution {
    public boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String Longpalin="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str=s.substring(i,j);

            if(isPalin(str)){
                if(Longpalin.length() < str.length()){
                       Longpalin=str;
                }
              }
            }
        }
        return Longpalin;
    }
}