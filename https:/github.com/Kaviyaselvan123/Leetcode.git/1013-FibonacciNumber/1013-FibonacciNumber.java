// Last updated: 7/14/2026, 2:04:50 PM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}