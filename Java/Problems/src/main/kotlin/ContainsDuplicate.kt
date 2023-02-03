class ContainsDuplicate {
    //https://leetcode.com/problems/contains-duplicate/
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices){
            val value = nums[i]
            if (map.containsKey(value)) return  true

            map[value] = i
        }

        return false
    }
}