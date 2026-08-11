// Last updated: 8/11/2026, 11:22:15 AM
1class Solution {
2    public String clearDigits(String s) {
3     String str="";
4      Stack<Character> st=new Stack<>();
5      for(int i=0;i<s.length();i++){
6        char ch=s.charAt(i);
7        int a=ch-'0';
8        if(a>=0&&a<=9){
9            st.pop();
10        }else{
11            st.push(ch);
12
13        }
14      }
15      while(!st.isEmpty()){
16        str=st.pop()+str;
17      }
18      return str; 
19    }
20}