package LeetCode.LinkedList

import LeetCode.ContainerWithMostWater
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class ContainerWithMostWaterTest {

    /**
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
     * In this case, the max area of water (blue section) the container can contain is 49.
     */
    @Test
    //@DisplayName("Input: height = [1,8,6,2,5,4,8,3,7]")
    fun  test_00(){
        //given
        val height = intArrayOf(1,8,6,2,5,4,8,3,7)
        //then
        val result = ContainerWithMostWater().maxArea(height)

       // assertE(49, result)
    }

}