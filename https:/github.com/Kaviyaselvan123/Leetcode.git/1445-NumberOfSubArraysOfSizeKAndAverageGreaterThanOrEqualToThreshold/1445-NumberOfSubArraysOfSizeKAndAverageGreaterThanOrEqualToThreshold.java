// Last updated: 7/14/2026, 2:04:49 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int window=0,c=0;
        for(int i=0;i<k;i++){
            window+=arr[i];
        }
        if((window/k)>=threshold){
            c++;
        }
        int ans=window;
        for(int i=k;i<arr.length;i++){
            window-=arr[i-k];
            window+=arr[i];
            if((window/k)>=threshold){
                c++;
            }
        }
        return c;
    }
}