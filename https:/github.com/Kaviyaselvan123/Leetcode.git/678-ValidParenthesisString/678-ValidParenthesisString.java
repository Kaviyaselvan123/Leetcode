// Last updated: 7/31/2026, 11:40:43 AM
class Solution {
    public boolean checkValidString(String s) {
        int max=0,min=0;
        for(char v:s.toCharArray()){
            if(v=='('){
                max++;
                min++;
            }else if(v==')'){
                max--;
                min--;
            }else{
                max++;
                min--;
            }
            if(max<0) return false;
            min=Math.max(0,min);
        }
        return min==0;
    }
}