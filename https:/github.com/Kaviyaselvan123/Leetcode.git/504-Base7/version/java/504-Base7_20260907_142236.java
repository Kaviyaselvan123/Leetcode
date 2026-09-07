// Last updated: 9/7/2026, 2:22:36 PM
1class Solution {
2    public String removeStars(String s) {
3        Stack<Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch!='*'){
7                st.push(ch);
8            }else{
9                st.pop();
10            }
11        }
12        StringBuilder str=new StringBuilder();
13        for(char c:st){
14            str.append(c);
15        }
16        return str.toString();
17    }
18}