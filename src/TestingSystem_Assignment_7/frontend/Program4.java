package TestingSystem_Assignment_7.frontend;

import java.util.Scanner;

import TestingSystem_Assignment_7.backend.Exercise4;

public class Program4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise4 test = new Exercise4();
		Scanner input = new Scanner(System.in);
		String pathName = input.nextLine();
		System.out.println(test.isFolder(pathName));
		input.close();
	}
}
