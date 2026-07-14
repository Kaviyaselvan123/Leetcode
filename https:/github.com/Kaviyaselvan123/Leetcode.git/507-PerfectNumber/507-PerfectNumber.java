// Last updated: 7/14/2026, 2:05:08 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
       for(int i=1;i<num;i++){
        if(num%i==0) s=s+i;
       }
       if(s==num) return true;
       else return false;
    }
}