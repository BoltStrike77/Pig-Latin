import java.util.*;
public class Pig_Latin_Converter {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please type out a sentence (or more) below to be converted to Pig Latin (no punctuation marks or capitalization):");
		String word;
		while(input.hasNext()) // makes sure program runs while there is input
		{
			// declaring the variables
			word = input.next();
			char[] wordLetters = word.toCharArray();
			ArrayList<Character> wordLettersList = new ArrayList<Character>();
			// editing the word
			for (int i = 0; i < word.length(); i++) {
				wordLettersList.add(wordLetters[i]);
			}
			wordLettersList.remove(0);
			wordLettersList.add(wordLetters[0]);
			wordLettersList.add('a');
			wordLettersList.add('y');
			// printing
			for (int i = 0; i < word.length()+2; i++) {
				System.out.print(wordLettersList.get(i));
			}
			System.out.print(" ");
		}
		input.close(); // close resources
	}

}