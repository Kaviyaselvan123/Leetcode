// Last updated: 8/18/2026, 10:36:38 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int []a=new int[nums1.length];
4        Stack<Integer> s=new Stack<>();
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int i=0;i<nums2.length;i++){
7            while(!s.isEmpty()&&s.peek()<nums2[i]){
8                map.put(s.pop(),nums2[i]);
9            }
10            s.push(nums2[i]);
11        }
12        while(!s.isEmpty()){
13            map.put(s.pop(),-1);
14        }
15        for(int i=0;i<nums1.length;i++){
16            a[i]=map.get(nums1[i]);
17        }
18        return a;
19    }
20    
21}