// Last updated: 7/31/2026, 11:40:36 AM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(self(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean self(int k){
        int y=k;
        while(k>0){
            int d=k%10;
            if(d==0){
                return false;
            }
            if(y%d!=0){
                return false;
            }
            k=k/10;
        }
        return true;
    }
}