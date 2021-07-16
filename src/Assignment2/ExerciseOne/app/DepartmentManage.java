package Assignment2.ExerciseOne.app;

import java.util.*;
import Assignment2.ExerciseOne.entity.*;

public class DepartmentManage {
	
	public static void initDepartment(List<Department> listDepartment) {
		Department sanam = new Department("SANNAM");
		Department ac = new Department("AC");
		Department p1 = new Department("P1");
		Department p2 = new Department("P2");
		listDepartment.add(sanam);
		listDepartment.add(ac);
		listDepartment.add(p1);
		listDepartment.add(p2);
	}
	
	public static void initEmployee(List<Employee> listEmployee) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listEmployee = new ArrayList<Employee>();
		List<Department> listDepartment = new ArrayList<Department>();
		initEmployee(listEmployee);
		initDepartment(listDepartment);
		Controller controller = new Controller(listEmployee, listDepartment);
	}

}
