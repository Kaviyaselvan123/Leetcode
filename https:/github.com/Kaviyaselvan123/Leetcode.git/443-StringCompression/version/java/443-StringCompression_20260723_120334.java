// Last updated: 7/23/2026, 12:03:34 PM
1class Solution {
2    public int compress(char[] chars) {
3        int i=0,j=0,w=0;
4        while(i<chars.length){
5            int c=0;
6            while(j<chars.length&&chars[i]==chars[j]){
7                j++;
8                c++;
9            }
10            chars[w++]=chars[i];
11            if(c>1){
12                String count=String.valueOf(c);
13                for(int k=0;k<count.length();k++){
14                    chars[w++]=count.charAt(k);
15                }
16            }
17            i=j;
18        }
19        return w;
20    }
21}