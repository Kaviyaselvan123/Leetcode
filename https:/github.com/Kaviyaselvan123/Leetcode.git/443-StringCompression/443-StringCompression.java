// Last updated: 7/31/2026, 11:41:06 AM
class Solution {
    public int compress(char[] chars) {
        int i=0,j=0,w=0;
        while(i<chars.length){
            int c=0;
            while(j<chars.length&&chars[i]==chars[j]){
                j++;
                c++;
            }
            chars[w++]=chars[i];
            if(c>1){
                String count=String.valueOf(c);
                for(int k=0;k<count.length();k++){
                    chars[w++]=count.charAt(k);
                }
            }
            i=j;
        }
        return w;
    }
}