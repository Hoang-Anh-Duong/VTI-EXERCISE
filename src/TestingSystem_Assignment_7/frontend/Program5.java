package TestingSystem_Assignment_7.frontend;

import java.util.List;
import java.util.Scanner;

import TestingSystem_Assignment_7.backend.*;

public class Program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise5 test = new Exercise5();
		Scanner input = new Scanner(System.in);
		String pathName = input.nextLine();
		List<String> listFile = test.getAllFileName(pathName);
		for (String s : listFile) {
			System.out.println(s);
		}
		input.close();
	}
}
