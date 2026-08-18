

Approach:
Use a HashMap to store the frequency of each element. First,
find the maximum frequency.Then, traverse the array again and count all
elements whose frequency equals the maximum frequency.


Time Complexity: O(n)

Space Complexity: O(n)





import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxfreq = 0;

        // Count frequency of each element
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > maxfreq) {
                maxfreq = map.get(num);
            }
        }

        int count = 0;

        // Count all elements having maximum frequency
        for (int i = 0; i < nums.length; i++) {

            if (map.get(nums[i]) == maxfreq) {
                count++;
            }
        }

        return count;
    }
}
