// Last updated: 7/14/2026, 2:04:58 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        char[] a=s.toCharArray();
        int i=0;
        while(i<a.length){
            if(!rotate(a,goal)){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
    public static boolean rotate(char[] a,String g){
        char b=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=b;
        if(new String(a).equals(g)){
            return true;
        }
        return false;
    } 
}