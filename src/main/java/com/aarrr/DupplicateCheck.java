package com.aarrr;

import java.util.Scanner;

public class DupplicateCheck {
	static void checkword(String scString, int length) {
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < length - 1; i++) {
			char c = Character.toLowerCase(scString.charAt(i));

			for (int j = i + 1; j < length; j++) {
				char d = Character.toLowerCase(scString.charAt(j));
				if (c == d) {
					if (buffer.indexOf(String.valueOf(c)) == -1) {
						buffer.append(c);
					}
				}
			}
		}
		System.out.println("Duplicate characters: " + buffer);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string for check duplicate : ");
		String word = scanner.nextLine();
		int length = word.length();
		checkword(word, length);

	}

}
