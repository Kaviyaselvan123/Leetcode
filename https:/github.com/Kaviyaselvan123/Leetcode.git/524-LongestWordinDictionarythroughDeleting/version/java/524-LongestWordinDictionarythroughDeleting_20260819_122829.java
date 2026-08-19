// Last updated: 8/19/2026, 12:28:29 PM
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int c=0,e=0;
4        for(int i=0;i<(s.length()/2);i++){
5            char a=s.charAt(i);
6            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
7                c++;
8            }
9        }
10        for(int i=s.length()/2;i<s.length();i++){
11            char b=s.charAt(i);
12            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
13                e++;
14            }
15        }
16        return c==e;
17    }
18}