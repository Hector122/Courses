import java.util.PriorityQueue

/**
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/">...</a>
 */
class TopKFrequentElements {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()

        for (i in nums) {
            freqMap[i] = freqMap.getOrDefault(i, 0) + 1
        }

        val priorityQueue = PriorityQueue<Int> { n1, n2 -> freqMap[n1]!! - freqMap[n2]!! }

        for (j in freqMap.keys){
            priorityQueue.add(j)

            if(priorityQueue.size > k) priorityQueue.poll()
        }

        val top = IntArray(k)
        for(i in k - 1 downTo 0){
            top[i] = priorityQueue.poll()
        }

        return top
    }

}

fun main() {
    val test = TopKFrequentElements()
    test.topKFrequent(intArrayOf(1,1,1,2,2,3), 2)
}
