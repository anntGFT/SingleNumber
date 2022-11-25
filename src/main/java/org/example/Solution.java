package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public Solution(){

    }

    public int singleNumber(int[] nums) {

        if (nums.length <= 1){

            return 0;
        }

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i+=2) {

            if(nums[i] != nums[i-1]) {

                return nums[i-1];
            }
        }

        return nums[nums.length-1];
    }


    //Me ha aprecido curioso como con bitWise y el operador ^ se puede hacer esto
    public int singleNumber2(int[] nums) {

        if (nums.length <= 1){

            return 0;
        }

        return Arrays.stream(nums)
                .reduce(0, (x,y) -> x ^ y);
    }
}