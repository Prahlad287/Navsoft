package com.classname;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Studentrecord {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] rollNumbers = new int[10];
        int[] scores = new int[10];

        System.out.println("Enter student records (roll number-score), one per line:");

        // Accept student records and store them in arrays
        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine().trim();
            String[] parts = input.split("-");

            if (parts.length == 2) {
                rollNumbers[i] = Integer.parseInt(parts[0].trim());
                scores[i] = Integer.parseInt(parts[1].trim());
            } else {
                System.out.println("Invalid input. Please use the format 'roll number-score'.");
                i--; // Decrement i to re-enter the record
            }
        }
		 
	        System.out.println("Student Records in Decreasing Order of Scores:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(rollNumbers[i] + "-" + scores[i]);
	        }
	}

}
