class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max=0;
        for(int i=0;i<nums2.length;i++){
            if(max<nums2[i]){
                max=nums2[i];
            }
        }
        int[] maxGreater = new int[max+1];
        Stack<Integer> stack = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            maxGreater[nums2[i]]=stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=maxGreater[nums1[i]];
        }
        return nums1;
    }
}