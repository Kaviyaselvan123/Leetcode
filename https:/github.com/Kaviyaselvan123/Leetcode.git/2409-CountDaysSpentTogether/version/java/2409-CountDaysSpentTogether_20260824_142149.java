// Last updated: 8/24/2026, 2:21:49 PM
1class Solution {
2    public String makeGood(String s) {
3        Stack<Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(st.isEmpty()){
7                st.push(ch);
8            }else if((Character.isUpperCase(ch)&&Character.isLowerCase(st.peek())||Character.isUpperCase(st.peek())&&Character.isLowerCase(ch))&&(Character.toLowerCase(ch)==Character.toLowerCase(st.peek()))){
9                    st.pop();
10            }else{
11                System.out.println(ch);
12                st.push(ch);
13            }
14        }
15        String si="";
16        for(char x:st){
17            si+=x;
18        }
19        return si;
20    }
21}