package Assignment2.ExerciseOne.app;

import java.util.*;
import Assignment2.ExerciseOne.entity.*;

public class Controller {
	List<Employee> listEmployee;
	List<Department> listDepartment;

	public Controller(List<Employee> employee, List<Department> department) {
		listEmployee = employee;
		listDepartment = department;
		menu(true);
	}

	void menu(boolean isContinue) {
		Scanner input = new Scanner(System.in);
		while (isContinue) {
			System.out.println("************** MENU **************");
			System.out.println("1 - Quan ly phong ban.");
			System.out.println("2 - Them nhan vien.");
			System.out.println("3 - Hien thi nhan vien.");
			System.out.println("4 - Tim kiem nhan vien.");
			try {
				int type = input.nextInt();
				input.nextLine();
				switch (type) {
				case 1:
					inputDepartment();
					isContinue = false;
					break;
				case 2:
					inputEmployee();
					isContinue = false;
					break;
				case 3:
					displayEmployee(listEmployee);
					break;
				default:
					System.out.println("Moi ban chon lai!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Moi ban chon lai!");
				isContinue = false;
				menu(true);
			}
		}
		input.close();
	}

	void inputDepartment() {
		boolean isContinue = true;
		Scanner input = new Scanner(System.in);
		while (isContinue) {
			System.out.println("********** INPUT DEPARTMENT ***********");
			System.out.println("0 - Thoat ra menu.");
			System.out.println("1 - Hien thi danh sach cac phong ban.");
			System.out.println("2 - Them phong ban.");
			try {
				int type = input.nextInt();
				switch (type) {
				case 0:
					isContinue = false;
					menu(true);
					break;
				case 1:
					displayListDepartment();
					isContinue = false;
					break;
				case 2:
					addDepartment();
					isContinue = false;
					break;
				default:
					System.out.println("Moi ban chon lai!");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Moi ban chon lai!");
				isContinue = false;
				inputDepartment();
			}
		}
		input.close();
	}

	void addDepartment() {
		System.out.println("******** ADD DEPARTMENT ********");
		System.out.print("Ten phong ban: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		Department department = new Department(name);
		boolean isDublicate = false;
		for (Department d : this.listDepartment) {
			if (name.endsWith(d.getDepartmentName())) {
				System.out.println("Ten phong ban bi trung!!! Them that bai!!");
				isDublicate = true;
				break;
			}
		}
		if (!isDublicate) {
			System.out.println("Them phong ban thanh cong");
			this.listDepartment.add(department);
		}
		inputDepartment();
		input.close();
	}

	void displayListDepartment() {
		boolean isContinue = true;
		Scanner input = new Scanner(System.in);
		while (isContinue) {
			System.out.println("********** LIST DEPARTMENT **********");
			if (!this.listDepartment.isEmpty()) {
				int index = 0;
				for (Department d : this.listDepartment) {
					System.out.println("Stt: " + ++index + " | Ten: " + d.getDepartmentName() + " | So nv: "
							+ d.getAmountEmployee());
				}
				System.out.println("Chon nut theo stt de xem chi tiet phong ban!");
				System.out.println("Chon 0 de thoat!");
			}
			int type = input.nextInt();
			input.nextLine();
			if (type == 0) {
				inputDepartment();
				isContinue = false;
			} else {
				try {
					if (this.listDepartment.get(type - 1) != null) {
						displayEmployee(this.listDepartment.get(type).getListOfEmployee());
					}
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Khong ton tai phong ban stt " + type);
					isContinue = false;
					displayListDepartment();
				}
			}
		}
		input.close();
	}
	
	int chooseDepartment() {
		boolean isContinue = true;
		Scanner input = new Scanner(System.in);
		while(isContinue) {
			System.out.println("************ CHOOSE DEPARTMENT ************");
			for(Department d:this.listDepartment) {
				System.out.println("1 - " + d.getDepartmentName());
			}
			try {
				int type = input.nextInt();
				input.nextLine();
				if(type >= 1 && type <= this.listDepartment.size()) {
					return type;
				}else {
					System.out.println("Moi ban chon lai!");
					break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Moi ban chon lai!");
				isContinue = false;
				chooseDepartment();
			}
		}
		return 0;
	}
	
	void inputEmployee() {
		boolean isContinueInput = true;
		Scanner input = new Scanner(System.in);
		while (isContinueInput) {
			System.out.println("************ INPUT EMPLOYEE ************");
			System.out.println("0 - Thoat ra menu.");
			System.out.println("1 - Them nhan vien lam chinh.");
			System.out.println("2 - Them nhan vien lam theo gio.");
			try {
				int type = input.nextInt();
				input.nextLine();
				int department = this.chooseDepartment();
				System.out.println(department);
				if (type == 1) {
					String ssn = Integer.toString(this.listEmployee.size());
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
					String ssn = Integer.toString(this.listEmployee.size());
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
				} else {
					System.out.println("Moi ban chon lai!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Moi ban chon lai!");
				isContinueInput = false;
				inputEmployee();
			} catch(IllegalArgumentException e) {
				System.out.println(e);
				isContinueInput = false;
				inputEmployee();
			}
		}
		input.close();
	}

	void displayEmployee(List<Employee> list) {
		int index = 0;
		if (listEmployee.isEmpty()) {
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

	void employeeSearch() {

	}

	void report() {

	}
}