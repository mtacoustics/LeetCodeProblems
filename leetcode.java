class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            // cur + x = target
            // x = target - cur
            int x = target - cur;
            if(map.containsKey(x)) {
                return new int[] { map.get(x), i};
                
            }
            map.put(cur,i);
        }
        return null;
    }
}

/*
Class and Method Declaration:

The code defines a class named Solution.
Inside the Solution class, there is a public method named twoSum which takes an integer array (nums) and an integer (target) as parameters. It returns an array of two integers.
Creating a HashMap:

Map<Integer, Integer> map = new HashMap<>();: A HashMap is created to store values and their indices from the array. The key is the value from the array, and the value is its index.
Iterating Over the Array:

The for loop for (i = 0; i < nums.length; i++) is intended to iterate over the array. However, there's a syntax error here: the variable i needs a type declaration. It should be for (int i = 0; i < nums.length; i++).
Finding the Complement:

For each element in the array (denoted as cur), the code calculates the complement (x) which, when added to cur, equals the target (x = target - cur).
Checking for the Complement:

if(map.containsKey(x)): The code checks if the complement (x) is already in the map. If it is, it means a pair has been found which adds up to the target.
If a pair is found, it returns an array containing the index of the complement (map.get(x)) and the current index (i).
Storing the Current Element and Index:

If the complement is not in the map, the current value and its index are stored in the map (map.put(cur, i)).
Returning the Result:

If a pair that sums up to the target is found, the indices of these two numbers are returned as an array.
If no such pair exists in the array, the method returns null.
*/
