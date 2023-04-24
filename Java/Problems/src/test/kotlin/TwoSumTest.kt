import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class TwoSumTest {
    lateinit var solution: TwoSum
    @Before
    fun setUp(){
        solution = TwoSum()
    }

    @Test
    @DisplayName("Input: nums = [2,7,11,15], target = 9 ")
    fun example_one(){
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val result = intArrayOf(0,1)

        assertArrayEquals(result, solution.twoSum(nums, target))
    }

    @Test
    @DisplayName("Input: nums = [3,2,4], target = 6 ")
    fun example_two(){
        val nums = intArrayOf(3,2,4)
        val target = 6
        val result = intArrayOf(1,2)

        assertArrayEquals(result, solution.twoSum(nums, target))
    }

    @Test
    @DisplayName("Input: nums = [3,3], target = 6 ")
    fun Example_one(){
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val result = intArrayOf(0,1)

        assertArrayEquals(result, solution.twoSum(nums, target))
    }
}