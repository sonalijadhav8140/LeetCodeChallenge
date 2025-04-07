package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_TwoPointer {
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) 
            continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list1.add(list);

         while (left < right && nums[left] == nums[left + 1])
          left++;
         while (left < right && nums[right] == nums[right - 1]) 
         right--;
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++; 
                }
                else {
                    right--;
                }
            }
        }

        return list1;
    }
}

    
}
