package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int result;
    int[] nums;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void givenOneNumbers(){

        result = 0;
        nums = new int[] {5};

        assertEquals(result, solution.singleNumber(nums));
        assertEquals(result, solution.singleNumber2(nums));

    }

    @Test
    public void givenThreeNumbers(){

        result = 4;
        nums = new int[] {5,4,5};

        assertEquals(result, solution.singleNumber(nums));
        assertEquals(result, solution.singleNumber2(nums));

    }

    @Test
    public void givenSevenNumbers(){

        result = 9;
        nums = new int[] {5,4,5,9,4,33,33};

        assertEquals(result, solution.singleNumber(nums));
        assertEquals(result, solution.singleNumber2(nums));

    }
}
