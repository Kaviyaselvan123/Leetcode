// Last updated: 8/10/2026, 12:41:32 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3     int a[]=new int[heights.length];
4     int k=0;
5     for(int x:heights){
6        a[k]=x;
7        k++;
8     }
9     Arrays.sort(heights);
10     int c=0;
11     for(int i=0;i<heights.length;i++){
12        if(heights[i]!=a[i]){
13            c++;
14        }
15     }   
16     return c;
17    }
18}