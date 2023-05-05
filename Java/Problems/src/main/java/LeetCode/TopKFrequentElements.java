package LeetCode;

import java.util.*;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> frequentHashMap = new HashMap<>();

        for (int num : nums) {
            frequentHashMap.put(num, frequentHashMap.getOrDefault(num, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> frequentHashMap.get(n1) - frequentHashMap.get(n2));

        // 2. keep k top frequent elements in the heap
        for (int n : frequentHashMap.keySet()) {
            minHeap.add(n);

            if (minHeap.size() > k) minHeap.poll();
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
