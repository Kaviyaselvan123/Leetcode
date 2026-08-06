// Last updated: 8/6/2026, 11:55:18 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        int n=0;
4        StringBuilder w=new StringBuilder();
5        for(int i=s.length()-1;i>=0;i--){
6            char ch=s.charAt(i);
7            if(ch=='-'){
8                continue;
9            }
10            if(n==k){
11                w.append('-');
12                n=0;
13            }
14            n++;
15            w.append(Character.toUpperCase(ch));
16            if(w.length()>0&&w.charAt(w.length()-1)=='-'){
17                w.deleteCharAt(w.length()-1);
18            }
19        }
20        return w.reverse().toString();
21    }
22}