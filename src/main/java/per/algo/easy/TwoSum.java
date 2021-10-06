package per.algo.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        Arrays.stream(twoSum(new int []{3,3}, 6))
                .asLongStream().forEach(System.out::println);

    }
    public static int[] twoSum(int[] nums, int target) {

        //Prepare a hashmap from nums,for speed lookup.

        Map<Integer,Integer>lookupMap=new HashMap<>();

        for(int i=0;i<nums.length;i++) {

            //figure out the number to look for
            int numberToLookFor=target-nums[i];
            Integer index= lookupMap.get(numberToLookFor);
            if(index!=null)
            {
                return new int[]{i,index};
            }

            if (lookupMap.get(nums[i]) == null){
                lookupMap.put(nums[i], i);
            }

        }
        return null;

    }
}
