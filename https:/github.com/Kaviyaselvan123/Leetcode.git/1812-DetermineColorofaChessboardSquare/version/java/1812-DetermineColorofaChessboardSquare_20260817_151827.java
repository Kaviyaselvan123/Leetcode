// Last updated: 8/17/2026, 3:18:27 PM
1class Solution {
2    public boolean squareIsWhite(String c) {
3       int a[][]={{0,1,0,1,0,1,0,1},
4                  {1,0,1,0,1,0,1,0},
5                  {0,1,0,1,0,1,0,1},
6                  {1,0,1,0,1,0,1,0},
7                  {0,1,0,1,0,1,0,1},
8                  {1,0,1,0,1,0,1,0},
9                  {0,1,0,1,0,1,0,1},
10                  {1,0,1,0,1,0,1,0}}; 
11    int i=-1;
12    switch(c.charAt(0)){
13        case 'a':
14            i=0;
15            break;
16        case 'b':
17            i=1;
18            break;
19        case 'c':
20            i=2;
21            break;
22        case 'd':
23            i=3;
24            break;
25        case 'e':
26            i=4;
27            break;
28        case 'f':
29            i=5;
30            break;
31        case 'g':
32            i=6;
33            break;
34        case 'h':
35            i=7;
36            break;
37        default:
38            break;
39    }
40    int j=(c.charAt(1)-'0')-1;
41    if(a[i][j]==1) return true;
42    return false;
43
44    }
45}