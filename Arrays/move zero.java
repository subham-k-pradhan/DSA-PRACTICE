
//approach  two pointers  where i use the pointer i an j
// j scans the array and i scans the track the position of nobn zero element
// then swap non zero element to front 
//  time complexity O(n) and space complexity O(1)
class Solution {
    
    public void moveZeroes(int[] nums) {

        int i = 0; // Pointer to place the next non-zero element

        // Traverse the array using j
        for (int j = 0; j < nums.length; j++) {

            // If current element is non-zero
            if (nums[j] != 0) {

                // Swap nums[i] and nums[j]
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                // i pointer Moveforward
                i++;
            }
        }
    }
}
