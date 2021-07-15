package Assignment2.ExerciseOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	List<Employee> listEmployee = new ArrayList<Employee>();

	public void menu(boolean isContinue) {
		Scanner input = new Scanner(System.in);
		while (isContinue) {
			System.out.println("************** MENU **************");
			System.out.println("1 - Them nhan vien.");
			System.out.println("2 - Hien thi nhan vien.");
			try {
				int type = input.nextInt();
				input.nextLine();
				switch (type) {
				case 1:
					inputEmployee(listEmployee);
					break;
				case 2:
					displayEmployee(listEmployee);
				default:
					break;
				}
			}catch(Exception e) {
				System.out.println("Moi ban chon lai!");
				isContinue = false;
				menu(true);
			}
			isContinue = false;
		}
		input.close();
	}

	void inputEmployee(List<Employee> listEmployee) {
		boolean isContinueInput = true;
		Scanner input = new Scanner(System.in);
		while (isContinueInput) {
			System.out.println("************** INPUT **************");
			System.out.println("0 - Thoat ra menu.");
			System.out.println("1 - Them nhan vien lam chinh.");
			System.out.println("2 - Them nhan vien lam theo gio.");
			int type = input.nextInt();
			input.nextLine();
			if (type == 1) {
				System.out.print("Nhap ssn: ");
				String ssn = input.nextLine();
				System.out.print("Nhap ho: ");
				String firstName = input.nextLine();
				System.out.print("Nhap ten: ");
				String lastName = input.nextLine();
				System.out.print("Nhap ti le hoa hong: ");
				double commissionRate = Double.parseDouble(input.nextLine());
				System.out.print("Nhap tong doanh thu: ");
				double grossSales = Double.parseDouble(input.nextLine());
				System.out.print("Nhap luong co ban: ");
				double basicSalary = Double.parseDouble(input.nextLine());
				SalariedEmployee sE = new SalariedEmployee(ssn, firstName, lastName, commissionRate, grossSales,
						basicSalary);
				listEmployee.add(sE);
			} else if (type == 2) {
				System.out.print("Nhap ssn: ");
				String ssn = input.nextLine();
				System.out.print("Nhap ho: ");
				String firstName = input.nextLine();
				System.out.print("Nhap ten: ");
				String lastName = input.nextLine();
				System.out.print("Nhap tien cong: ");
				double wage = input.nextDouble();
				System.out.print("Nhap so gio lam: ");
				double workingHous = input.nextDouble();
				HourlyEmployee hE = new HourlyEmployee(ssn, firstName, lastName, wage, workingHous);
				listEmployee.add(hE);
			} else if (type == 0) {
				isContinueInput = false;
				menu(true);
			}
		}
		input.close();
	}

	void displayEmployee(List<Employee> listEmployee) {
		if(listEmployee.isEmpty()) {
			System.out.println("Danh sach nhan vien trong!");
		}else {
			System.out.println("**********************************");
			System.out.println("Danh sach nhan vien:");
			for(Employee e:listEmployee) {
				e.display();
			}
			System.out.println("**********************************");
		}
		
	}

	void employeeSearch() {

	}

	void report() {

	}
}