// Last updated: 8/12/2026, 2:30:49 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3      int b=(int)target;
4      for(int i=0;i<letters.length;i++){
5        int a=(int)letters[i];
6        if(a<=b){
7            continue;
8        }
9        return letters[i];
10
11      } 
12      return letters[0]; 
13    }
14}