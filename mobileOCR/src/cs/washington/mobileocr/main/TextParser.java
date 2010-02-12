package cs.washington.mobileocr.main;

/*
 * Team Sparkplugs (Josh Scotland and Hussein Yapit)
 * This class parses the text into an array that will be read using TTS
 */

public class TextParser {
	
	/* 
	 * Parses a block of text into sentences by the punctuation
	 */
	public static String[] sentenceParse(String passedString) {
		String delims = "[.?!,]+";
		String[] tokens = passedString.trim().split(delims);
		return tokens;
	}
	
	/*
	 * Parses a block of text into words by the spaces
	 */
	public static String[] wordParse(String passedString) {
		String delims = "[ ]+";
		String[] tokens = passedString.trim().split(delims);
		return tokens;
	}
	
	public static int[] countWordsInSentence(String[] passedSentences) {
		String delims = "[ ]+";
		int count = 0;
		int[] wordsInSentence = new int[passedSentences.length];
		for (int i = 0; i < wordsInSentence.length; i++) { 
			count += passedSentences[i].trim().split(delims).length;
			wordsInSentence[i] = count;
		}
		return wordsInSentence;
	}
}
