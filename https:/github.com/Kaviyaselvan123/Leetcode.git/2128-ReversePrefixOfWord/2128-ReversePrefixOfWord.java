// Last updated: 7/31/2026, 11:39:54 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0,j=word.indexOf(ch);
        char []a=word.toCharArray();
        while(i<j){
            char t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        return new String(a);
    }
}