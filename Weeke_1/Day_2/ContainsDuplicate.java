class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set <Integer> list=new HashSet<>();
       for(int arr:nums){
        if(list.contains(arr)){
            return true;
        }
        list.add(arr);
       }
       return false;
}
}
/*Or we can solve by sorting techinique
 int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
                if (nums[i] == nums[i+1])
                    return true;
            }
        
        return false;*\
