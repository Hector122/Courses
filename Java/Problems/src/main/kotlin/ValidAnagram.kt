class ValidAnagram {

    //https://leetcode.com/problems/valid-anagram/
    fun isAnagram(s: String, t: String): Boolean {
        // If the lengths of s and t are different, they can't be anagrams
        if (s.length != t.length) return false

        if (s == t) return true

        // Create an array of 26 integers to store the frequency of each letter
        val arr = Array(26) { 0 }

        // Loop through each character in s and t, and update the frequency array
        for (i in s.indices) {
            arr[s[i] - 'a']++
            arr[t[i] - 'a']--
        }

        // If all frequencies are zero, the strings are anagrams
        for(n in arr){
            if (n != 0) return false
        }

        return true
    }
}