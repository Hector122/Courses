class TwoSum {
    //https://leetcode.com/problems/two-sum/

    //Brute force with two for
    fun twoSumNotOptimal(numbs: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in numbs.indices) {
            for (j in i + 1 until numbs.size) {
                if(numbs[i] + numbs[j] == target){
                    return  intArrayOf(i, j)
                }
            }
        }
        return result
    }

    // with hash Map
    fun twoSum(numbs: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int?, Int?>()

        for (i in numbs.indices){
            val value = target - numbs[i]
            if(hashMap.containsKey(value)){
                return intArrayOf(hashMap[value]!!, i)
            }

            hashMap[numbs[i]] = i
        }

        return intArrayOf()
    }
}