package Hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordsInStrings {

	public static void main(String[] args) {
		String string = "Unlike traditional media repositories, Wikimedia Commons is free. Everyone is allowed to copy, use and modify any files here freely as long as they follow the terms specified by the author; this often means crediting the source and author(s) appropriately and releasing copies/improvements under the same freedom to others. The license conditions of each individual media file can be found on their description page. The Wikimedia Commons database itself and the texts in it are licensed under the Creative Commons Attribution/Share-Alike License. More information on re-use can be found at Commons:Reusing content outside Wikimedia and Commons:First steps/Reuse.";
		int count;

		// Converts the string into lowercase
		string = string.toLowerCase();

		// Split the string into words using built-in function
		String words[] = string.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					// Set words[j] to 0 to avoid printing visited word
					words[j] = "0";
				}
			}

			// Displays the duplicate word if count is greater than 1
			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);			
		}
	}

}
