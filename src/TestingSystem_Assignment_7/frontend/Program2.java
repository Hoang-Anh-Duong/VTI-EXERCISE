package TestingSystem_Assignment_7.frontend;

import java.util.Scanner;

import TestingSystem_Assignment_7.backend.*;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 test = new Exercise2();
		Scanner input = new Scanner(System.in);
		String pathName = input.nextLine();
		test.createNewFile(pathName);
		input.close();
	}

}
