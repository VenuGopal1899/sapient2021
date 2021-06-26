package beanswithannotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beanswithannotation.bean.AppConfig;
import beanswithannotation.bean.Department;
import beanswithannotation.bean.Employee;
import beanswithannotation.service.DepartmentManager;
import beanswithannotation.service.EmployeeManager;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext appCon=new AnnotationConfigApplicationContext(AppConfig.class);
		//AnnotationConfigApplicationContext
		//appCon.register(AppConfig.class);
		
		EmployeeManager empMgr= appCon.getBean(EmployeeManager.class);
		Employee emp = empMgr.create();
		System.out.println(emp);
		
		DepartmentManager deptMgr = appCon.getBean(DepartmentManager.class);
		Department dept = deptMgr.create();
		System.out.println(dept);
		System.out.println(dept.getDeptName());
		
	}

}
