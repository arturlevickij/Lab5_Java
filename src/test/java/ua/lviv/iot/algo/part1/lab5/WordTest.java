package ua.lviv.iot.algo.part1.lab5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class WordTest {
	@Test
	public void testSwapWordsWithEmptyInput() {
	    String input = "";
	    String expectedOutput = "";
	    String actualOutput = Word.swapWords(input);
	    assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testSwapWords() {
	    String input = "its a longest word in a whole world.";
	    String expectedOutput = "longest a its word in a whole world.";
	    String actualOutput = Word.swapWords(input);
	    assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
    public void testSwapWordsWithLongWords() {
        String text = "Supercalifragilisticexpialidocious this element is long too.";
        String expected = "Supercalifragilisticexpialidocious this element is long too.";
        String result = Word.swapWords(text);
        assertEquals(expected, result);
    }
}
