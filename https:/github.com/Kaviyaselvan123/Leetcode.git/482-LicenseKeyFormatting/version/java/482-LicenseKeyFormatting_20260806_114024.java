// Last updated: 8/6/2026, 11:40:24 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s=s.toUpperCase();
4        StringBuilder w=new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)!='-'){
7                w.append(s.charAt(i));
8            }
9        }
10        int n=0;
11        StringBuilder r=new StringBuilder();
12        for(int i=w.length()-1;i>=0;i--){
13            n++;
14            r.append(w.charAt(i));
15            if(k==n){
16                n=0;
17                r.append('-');
18            }
19        }
20        r.reverse();
21        if(r.length()>0&&r.charAt(0)=='-'){
22            r.deleteCharAt(0);
23        }
24        return r.toString();
25    }
26}