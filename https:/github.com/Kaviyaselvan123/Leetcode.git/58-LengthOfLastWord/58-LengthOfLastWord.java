// Last updated: 7/14/2026, 2:06:14 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        String res=s.trim();
        for(int i=res.length()-1;i>=0;i--){
            if(res.charAt(i)!=' '){
                l++;
            }else{
                return l;
            }
        }
        return l;
    }
}