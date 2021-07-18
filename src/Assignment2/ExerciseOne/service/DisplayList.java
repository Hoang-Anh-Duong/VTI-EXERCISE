package Assignment2.ExerciseOne.service;

import java.util.List;

import Assignment2.ExerciseOne.entity.Employee;

public class DisplayList {
	public void displayEmployee(List<Employee> list) {
		int index = 0;
		if (list.isEmpty()) {
			System.out.println("Danh sach nhan vien trong!");
		} else {
			System.out.println("********** LIST EMPLOYEE **********");
			for (Employee e : list) {
				System.out.print("Stt: " + ++index + " | ");
				if (e.getClass().getName() == "Assignment2.ExerciseOne.entity.SalariedEmployee") {
					System.out.println("*Nhan vien chinh thuc*");
				} else if (e.getClass().getName() == "Assignment2.ExerciseOne.entity.HourlyEmployee") {
					System.out.println("*Nhan vien lam theo gio*");
				}
				e.display();
			}
			System.out.println("**********************************");
		}
	}

	public void displayHourlyEmployee(List<Employee> list) {
		int index = 0;
		if (list.isEmpty()) {
			System.out.println("Danh sach nhan vien trong!");
		} else {
			System.out.println("******* LIST HOURLY EMPLOYEE *******");
			for (Employee e : list) {
				if (e.getClass().getName() == "Assignment2.ExerciseOne.entity.HourlyEmployee") {
					System.out.println("Stt: " + ++index + " | ");
					e.display();
				}
			}
			System.out.println("**********************************");
		}
	}

	public void displaySalariedEmployee(List<Employee> list) {
		int index = 0;
		if (list.isEmpty()) {
			System.out.println("Danh sach nhan vien trong!");
		} else {
			System.out.println("******* LIST SALARIED EMPLOYEE *******");
			for (Employee e : list) {
				if (e.getClass().getName() == "Assignment2.ExerciseOne.entity.SalariedEmployee") {
					System.out.println("Stt: " + ++index + " | ");
					e.display();
				}
			}
			System.out.println("**********************************");
		}
	}
}
