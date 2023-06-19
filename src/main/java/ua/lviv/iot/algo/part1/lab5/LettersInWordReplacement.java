package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersInWordReplacement {

	public String swapWords(String text) {
		Pattern sentencePattern = Pattern.compile("[^.!?]+");
		Matcher matcher = sentencePattern.matcher(text);
		StringBuilder result = new StringBuilder();

		while (matcher.find()) {
			String sentence = matcher.group().trim();
			String[] words = sentence.split("\\s+");
			int longestWordIndex = 0;
			for (int i = 1; i < words.length; i++) {
				if (words[i].length() > words[longestWordIndex].length()) {
					longestWordIndex = i;
				}
			}
			String firstVowelLetter = null;
			for (int a = 0; a < words.length; a++) {
				if (words[a].matches("^[aeiouAEIOU].*")) {
					firstVowelLetter = words[a];
					break;
				}
			}
			if (longestWordIndex > 0 && firstVowelLetter != null) {
				words[0] = words[longestWordIndex];
				words[longestWordIndex] = firstVowelLetter;
			}
			result.append(String.join(" ", words)).append(".");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String text = "its word is too long";
		final LettersInWordReplacement word = new LettersInWordReplacement();
		String result = word.swapWords(text);
		System.out.println(result);
	}
}
