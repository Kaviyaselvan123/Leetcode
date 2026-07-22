// Last updated: 7/22/2026, 11:11:19 AM
1class Solution {
2    public String reverseWords(String s) {
3        String t=s.replaceAll("\\s+"," ").trim();
4        String a[]=t.split(" ");
5        int i=0,j=a.length-1;
6        while(i<j){
7            String w=a[i];
8            a[i]=a[j];
9            a[j]=w;
10            i++;
11            j--;
12        }
13        return String.join(" ",a);
14    }
15}