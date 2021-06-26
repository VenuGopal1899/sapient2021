package beanswithannotation.service;

import beanswithannotation.bean.Department;
import beanswithannotation.bean.Employee;

public class DepartmentManagerImpl implements DepartmentManager{

	@Override
	public Department create() {
		Department dept = new Department();
		dept.setDeptName("Services");
		
		return dept;
	}

}
