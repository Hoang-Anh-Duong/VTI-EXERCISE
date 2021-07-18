package TestingSystem_Assignment_7.frontend;

import java.util.Scanner;

import TestingSystem_Assignment_7.backend.Exercise8;

public class Program8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Exercise8 test = new Exercise8();
		Scanner input = new Scanner(System.in);
		String pathName = input.nextLine();
		test.renameFile(pathName, "newName");
		input.close();
	}

}
