package beanswithannotation.service;

import beanswithannotation.bean.Employee;

public class EmployeeManagerImpl implements EmployeeManager {

	public Employee create() {
		Employee emp = new Employee();
		
		emp.setEmpName("Sahil");
		return emp;
	}

}
