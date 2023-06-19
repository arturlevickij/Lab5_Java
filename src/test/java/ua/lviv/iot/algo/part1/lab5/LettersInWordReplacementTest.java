package ua.lviv.iot.algo.part1.lab5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class LettersInWordReplacementTest {
	@Test
	public void testSwapWordsWithEmptyInput() {
		final LettersInWordReplacement word = new LettersInWordReplacement();
	    String input = "";
	    String expectedOutput = "";
	    String actualOutput = word.swapWords(input);
	    assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testSwapWords() {
		final LettersInWordReplacement word = new LettersInWordReplacement();
	    String input = "its a longest word in a whole world.";
	    String expectedOutput = "longest a its word in a whole world.";
	    String actualOutput = word.swapWords(input);
	    assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
    public void testSwapWordsWithLongWords() {
		final LettersInWordReplacement word = new LettersInWordReplacement();
        String text = "element is too long Supercalifragilisticexpialidocious.";
        String expected = "Supercalifragilisticexpialidocious is too long element.";
        String result = word.swapWords(text);
        assertEquals(expected, result);
    }
}
