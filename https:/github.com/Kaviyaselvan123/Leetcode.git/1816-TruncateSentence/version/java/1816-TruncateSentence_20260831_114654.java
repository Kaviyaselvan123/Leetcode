// Last updated: 8/31/2026, 11:46:54 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(str[i]);
            if(i!=k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}