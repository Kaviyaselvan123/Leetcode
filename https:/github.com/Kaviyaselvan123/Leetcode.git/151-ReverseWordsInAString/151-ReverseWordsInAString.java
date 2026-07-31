// Last updated: 7/31/2026, 11:42:12 AM
class Solution {
    public String reverseWords(String s) {
        String t=s.replaceAll("\\s+"," ").trim();
        String a[]=t.split(" ");
        int i=0,j=a.length-1;
        while(i<j){
            String w=a[i];
            a[i]=a[j];
            a[j]=w;
            i++;
            j--;
        }
        return String.join(" ",a);
    }
}