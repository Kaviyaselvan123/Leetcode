// Last updated: 8/31/2026, 11:45:54 AM
1class Solution {
2    public String truncateSentence(String s, int k) {
3       String []a=s.split("\\s+");
4       StringBuilder st=new StringBuilder();
5       for(int i=0;i<k;i++){
6        st.append(a[i]);
7        if(i!=k-1){
8            st.append(" ");
9        }else{
10            return st.toString();
11        }
12       }
13       return ""; 
14    }
15}