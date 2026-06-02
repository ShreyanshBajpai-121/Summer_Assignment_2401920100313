class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double windsum=0.0;
       double maxsum=0.0;
       // first find the sum of window with size k
       for(int i=0;i<k;i++){
        windsum+=nums[i];
       }
        maxsum=windsum;
        for(int i=k;i<nums.length;i++){
            windsum+=nums[i]-nums[i-k];
            if(windsum>maxsum){
                maxsum=windsum;
            }
        }
        return maxsum/k;
       } 
    }
