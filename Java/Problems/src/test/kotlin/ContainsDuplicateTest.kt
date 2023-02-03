import LeetCode.ContainerWithMostWater
import org.junit.Assert
import org.junit.Test

internal class ContainsDuplicateTest {
    /**
     * Input: nums = [1,2,3,1]
     * Output: true
     */
    @Test
//@DisplayName("Input: nums = [1,2,3,1]")
    fun test_00() {
        //given
        val nums = intArrayOf(1, 2, 3, 1)
        //then
        val result = ContainsDuplicate().containsDuplicate(nums)
        //result
       Assert.assertEquals(true, result)
    }
}

