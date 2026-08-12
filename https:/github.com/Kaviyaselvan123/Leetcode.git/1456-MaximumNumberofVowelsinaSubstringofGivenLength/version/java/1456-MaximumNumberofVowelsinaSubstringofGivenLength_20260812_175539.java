// Last updated: 8/12/2026, 5:55:39 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3     int c=0,d=0;
4     for(int i=0;i<k;i++){
5        char ch=s.charAt(i);
6        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
7            c++;
8        }
9     }  
10     if(c>d){
11        d=c;
12     }
13     int f=k;
14     while(f<s.length()){
15        char st=s.charAt(f-k);
16        if(st=='a'||st=='e'||st=='i'||st=='o'||st=='u'){
17            c--;
18        }
19        char end=s.charAt(f);
20        if(end=='a'||end=='e'||end=='i'||end=='o'||end=='u'){
21            c++;
22        }
23        if(c>d){
24            d=c;
25        }
26        f++;
27     }
28     return d;
29    }
30    
31}