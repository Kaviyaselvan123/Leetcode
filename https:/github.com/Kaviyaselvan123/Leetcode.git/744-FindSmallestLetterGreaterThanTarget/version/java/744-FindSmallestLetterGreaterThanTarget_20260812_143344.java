// Last updated: 8/12/2026, 2:33:44 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3      //char a=target;
4      for(int i=0;i<letters.length;i++){
5        char a=letters[i];
6        if(a<=target){
7            continue;
8        }
9        return letters[i];
10
11      } 
12      return letters[0]; 
13    }
14}