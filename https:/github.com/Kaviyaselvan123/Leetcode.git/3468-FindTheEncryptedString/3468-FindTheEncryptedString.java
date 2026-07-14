// Last updated: 7/14/2026, 2:04:38 PM
class Solution {
    public String getEncryptedString(String s, int k) {
        char[] a=new char[s.length()];
        for(int i=0;i<s.length();i++){
            int b=i+k;
            if(b>=s.length()){
                a[i]=s.charAt(b%s.length());
            }else{
                a[i]=s.charAt(b);
            }
        }
        return new String(a);
    }
}