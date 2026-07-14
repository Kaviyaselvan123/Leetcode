// Last updated: 7/14/2026, 2:05:00 PM
class Solution {
    public String toLowerCase(String s) {
        String a = "";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
               ch=(char)(ch+32);
               a += ch;
            }else{
                a += ch;
            }
        }

        return a;
    }
}