// Last updated: 7/14/2026, 2:05:25 PM
class Solution {
    public String reverseVowels(String s) {
        char mp[]=s.toCharArray();
        int k=0,d=mp.length-1;
        while(k<d){
            while(k<d&&!isvowel(mp[k])){
                k++;
            }
            while(k<d&&!isvowel(mp[d])){
                d--;
            }
            char t=mp[k];
            mp[k]=mp[d];
            mp[d]=t;
            k++;
            d--;
        }
        return new String(mp);
    }
    public static boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}