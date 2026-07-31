// Last updated: 7/31/2026, 11:51:45 AM
1class Solution {
2    public boolean strongPasswordCheckerII(String password) {
3      if(password.length()<8){
4        return false;
5      }  
6      if(!password.matches(".*[a-z].*")){
7        return false;
8      }
9      if(!password.matches(".*[A-Z].*")){
10        return false;
11      }
12      if(!password.matches(".*[0-9].*")){
13        return false;
14      }
15      if(!password.matches(".*[!@#$%^&*()\\+-].*")){
16        return false;
17      }
18      int i=0,j=1;
19      while(j<password.length()){
20        if(password.charAt(i)==password.charAt(j)){
21            return false;
22        }
23        i++;
24        j++;
25      }
26      return true;
27    }
28}