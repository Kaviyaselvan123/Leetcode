// Last updated: 7/14/2026, 2:05:03 PM
class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return ispalin(s,i+1,j)||ispalin(s,i,j-1);
            } 
        }
        return true;
    }
    public static boolean ispalin(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}