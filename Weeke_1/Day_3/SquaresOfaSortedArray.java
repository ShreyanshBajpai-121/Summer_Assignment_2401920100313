class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;
        while(left<=right){
            int l=nums[left]*nums[left];
            int r=nums[right]*nums[right];
            if(l>r){
                ans[pos--]=l;
                left++;
            }else{
                ans[pos--]=r;
                right--;
            }
        }
        return ans;
    }
}
