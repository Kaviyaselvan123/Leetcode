// Last updated: 7/25/2026, 2:12:58 PM
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> list=new ArrayList<>();
4        for(int i=left;i<=right;i++){
5            if(self(i)){
6                list.add(i);
7            }
8        }
9        return list;
10    }
11    public static boolean self(int k){
12        int y=k;
13        while(k>0){
14            int d=k%10;
15            if(d==0){
16                return false;
17            }
18            if(y%d!=0){
19                return false;
20            }
21            k=k/10;
22        }
23        return true;
24    }
25}