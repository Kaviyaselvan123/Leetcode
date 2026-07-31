// Last updated: 7/31/2026, 11:20:04 AM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int j=word.indexOf(ch);
4        String v="";
5        for(int i=j;i>=0;i--){
6            v+=word.charAt(i);
7        }
8        v+=word.substring(j+1,word.length());
9        return v;
10    }
11}