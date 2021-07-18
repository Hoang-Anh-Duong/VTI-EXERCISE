package TestingSystem_Assignment_7.frontend;

import java.util.Scanner;

import TestingSystem_Assignment_7.backend.Exercise3;

public class Program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise3 test = new Exercise3();
		Scanner input = new Scanner(System.in);
		String pathName = input.nextLine();
		test.deleteFile(pathName);
		input.close();
	}
}
