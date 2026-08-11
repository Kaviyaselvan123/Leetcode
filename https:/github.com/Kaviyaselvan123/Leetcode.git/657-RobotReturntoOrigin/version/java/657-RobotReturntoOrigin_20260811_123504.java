// Last updated: 8/11/2026, 12:35:04 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3    int x=0,y=0;
4    for(int i=0;i<moves.length();i++){
5        char ch=moves.charAt(i);
6        if(ch=='R'){
7            x++;
8        }else if(ch=='L'){
9            x--;
10        }else if(ch=='U'){
11            y++;
12        }else{
13            y--;
14        }
15    }
16    return x==0&&y==0;
17    }
18}