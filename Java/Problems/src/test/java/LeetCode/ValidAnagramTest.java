package LeetCode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    @DisplayName("Input: s = \"anagram\", t = \"nagaram   true")
    void anagram_and_nagaram_are_valid(){
        //given
        String s = "anagram", t = "nagaram";
        //then
        boolean result = validAnagram.isAnagram(s, t);

        assertTrue(result);
    }

    @Test
    @DisplayName("Input: s = \"rat\", t = \"car   false")
    void rat_and_cat_are_invalid(){
        //given
        String s = "rat", t = "car";
        //then
        boolean result = validAnagram.isAnagram(s, t);

        assertFalse(result);
    }


    @Test
    @DisplayName("Input: s = aacc, t = ccac  false")
    void aacc_and_ccac_are_invalid(){
        //given
        String s = "aacc", t = "ccac";
        //then
        boolean result = validAnagram.isAnagram(s, t);

        assertFalse(result);
    }
}