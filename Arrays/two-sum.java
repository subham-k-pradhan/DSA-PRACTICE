// approach brute forc
//time complexity :O(N^2) and space complexity O(1)
//return indices of two number whose sum equal to target


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
           
        }
        return new int[]{-1,-1};
    }
}
