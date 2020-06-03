import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main (String[] args) {
        int[] givenNums = {3,2,4};
        int target = 6;
        //bruteForceTwoSum(givenNums, target);
        twoSum(givenNums, target);
    }
    public static int[] bruteForceTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i< nums.length; i++) {
            for (int j=i+1; j < nums.length ; j++){
                if ( nums[i] + nums[j] == target ){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
    // 3MS, 52.02 %, 39.3 MB , 8.27 .. still not good
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int j=0; j < nums.length; j++) {
            myMap.put(nums[j], j);
        }

        for(int i=0; i <nums.length; i++ ){
            int secondPair = target - nums[i];
            myMap.remove(nums[i], i );
            if (myMap.containsKey(secondPair)) {
                result[0] = i;
                result[1] = myMap.get(secondPair);
                return result;
            }
        }
        return null;
    }
}
