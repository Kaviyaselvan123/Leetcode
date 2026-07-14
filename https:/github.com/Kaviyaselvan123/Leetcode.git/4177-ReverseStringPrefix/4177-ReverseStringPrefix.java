// Last updated: 7/14/2026, 2:04:36 PM
class Solution {
    public String reversePrefix(String s, int k) {
       char[] a=s.toCharArray();
       return rotate(0,k-1,a);
    }
    public String rotate(int i,int j,char[] a){
       while(i<j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
       } 
       return new String(a);
    }
}