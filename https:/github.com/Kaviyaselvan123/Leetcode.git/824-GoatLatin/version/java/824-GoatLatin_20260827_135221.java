// Last updated: 8/27/2026, 1:52:21 PM
1class Solution {
2    public String toGoatLatin(String se) {
3     StringBuilder s=new StringBuilder();
4     String[] b=se.trim().split("\\s+");
5     for(int i=0;i<b.length;i++){
6        char ch=b[i].charAt(0);
7        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
8            s.append(b[i]);
9            s.append("ma");
10        }else{
11            s.append(b[i].substring(1));
12            s.append(ch);
13            s.append("ma");
14        }
15        for(int j=0;j<=i;j++){
16            s.append('a');
17        }
18        if(i!=b.length-1){
19            s.append(" ");
20        }
21     } 
22     return s.toString();
23    }
24}