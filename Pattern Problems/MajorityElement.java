Majority Element

Uses a HashMap to count the frequency of each element in an array.
Stores each unique element as a key and its occurrence count as the value.
After counting, the frequencies are checked to identify the required element.
Time Complexity: O(n) 
Space Complexity: O(n)


  
  1. Using containsKey()

Checks whether the element already exists in the map.
If it exists, its frequency is increased by 1; otherwise, it is added with frequency 1.

  import java.util.HashMap;

class MajorityElementContainsKey {

    public static int majorityElement(int[] nums) {

        // Create a HashMap to store:
        // Key   = array element
        // Value = frequency of that element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Check whether the element already exists
            if (map.containsKey(num)) {

                // If it exists, increase its frequency by 1
                map.put(num, map.get(num) + 1);

            } else {

                // If it does not exist, add it with frequency 1
                map.put(num, 1);
            }
        }

        // Check each key in the HashMap
        for (Integer key : map.keySet()) {

            // Check if the frequency is greater than n/2
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        // Return -1 if no majority element is found
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }
}


****************************

2. Using getOrDefault()

Gets the current frequency of an element, or returns 0 if the element does not exist.
Then 1 is added to the frequency and the updated value is stored back in the map.

Both approaches produce the same result; getOrDefault() is simply more concise.


  import java.util.HashMap;

class MajorityElementGetOrDefault {

    public static int majorityElement(int[] nums) {

        // Create a HashMap to store:
        // Key   = array element
        // Value = frequency of that element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Get the current frequency of num.
            // If num does not exist, getOrDefault() returns 0.
            // Then add 1 to increase the frequency.
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check each key in the HashMap
        for (Integer key : map.keySet()) {

            // Check if the frequency is greater than n/2
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        // Return -1 if no majority element is found
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }
}


  
