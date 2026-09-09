// Last updated: 9/9/2026, 4:19:55 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3    char[] b=s.toCharArray();
4    for(int i=0;i<b.length;i+=2*k){
5        int l=i;
6        int r=Math.min(i+k-1,b.length-1);
7        while(l<r){
8            char temp=b[l];
9            b[l]=b[r];
10            b[r]=temp;
11            l++;
12            r--;
13        }
14    }
15        return new String(b); 
16    }
17}