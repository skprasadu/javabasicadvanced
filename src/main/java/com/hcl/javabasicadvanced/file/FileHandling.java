package com.hcl.javabasicadvanced.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writeToFile();

		readFromFile();
		
		readFileLineByLine_BestPractice();
	}

	/*
	 * This is the best practice for reading a text file
	 * This is ONLY for text files
	 */
	private static void readFileLineByLine_BestPractice() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Printing the file, best practice........");
		try (FileReader fr = new FileReader("output1.txt");
				BufferedReader br = new BufferedReader(fr)) {
			// read from FileReader till the end of file
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

	private static void readFromFile() throws IOException {
		
		int ch = '\0';
		System.out.println("Printing the file........");
		try (FileReader fr = new FileReader("output.txt");) {
			// read from FileReader till the end of file
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		}
		System.out.println();
	}

	private static void writeToFile() throws IOException {
		// TODO Auto-generated method stub
		String str = "File Handling in Java using " + " FileWriter and FileReader";

		// try with resource ??????????
		try (FileWriter fw = new FileWriter("output.txt");) {
			for (int i = 0; i < str.length(); i++) {
				fw.write(str.charAt(i));
			}

			System.out.println("Writing successful");
		}
	}

}
