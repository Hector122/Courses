import org.junit.Assert
import org.junit.Before
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ValidAnagramTest {

   val validAnagram = ValidAnagram()

    @Test
    @DisplayName("Input: s = anagram, t = nagaram   true")
    fun anagram_and_nagaram_are_valid() {
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"))
    }

    @Test
    @DisplayName("Input: s = \"rat\", t = \"car\"   false")
    fun rat_and_cat_are_invalid() {
        //given
        val s = "rat"
        val t = "car"
        //then
        val result: Boolean = validAnagram.isAnagram(s, t)
        Assert.assertFalse(result)
    }


    @Test
    @DisplayName("Input: s = aacctttttttt, t = ccac  false")
    fun aacc_and_ccac_are_invalid() {
        //given
        val s = "aaccttttt"
        val t = "ccacbbbbb"
        //then
        val result: Boolean = validAnagram.isAnagram(s, t)
        Assert.assertFalse(result)
    }
}