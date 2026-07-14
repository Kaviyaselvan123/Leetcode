// Last updated: 7/14/2026, 2:06:29 PM
class Solution {
    public int intval(char ch){
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else if(ch=='M') return 1000;
        else return 0;
    }
    public int romanToInt(String s) {
        int sum=0;
        int i;
        for(i=0;i<s.length()-1;i++){
            if(intval(s.charAt(i)) >= intval(s.charAt(i+1))){
                sum+=intval(s.charAt(i));
            }else{
                sum+=intval(s.charAt(i+1))-intval(s.charAt(i));
                i++;
            }
        }
        if(i!=s.length()) sum+=intval(s.charAt(i));
        return sum;
    }
}