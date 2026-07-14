// Last updated: 7/14/2026, 2:04:35 PM
class Solution {
    public boolean isBalanced(String num) {
    int odd=0,even=0;
    for(int i=0;i<num.length();i++){
        int a=num.charAt(i)-'0';
        if(i%2==0) even+=a;
        else odd+=a;
    }   
    if(odd==even){
        return true;
    }
    return false;
    }
}