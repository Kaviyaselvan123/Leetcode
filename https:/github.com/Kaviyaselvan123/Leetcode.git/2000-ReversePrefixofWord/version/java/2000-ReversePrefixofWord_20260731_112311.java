// Last updated: 7/31/2026, 11:23:11 AM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int i=0,j=word.indexOf(ch);
4        char []a=word.toCharArray();
5        while(i<j){
6            char t=a[i];
7            a[i]=a[j];
8            a[j]=t;
9            i++;
10            j--;
11        }
12        return new String(a);
13    }
14}