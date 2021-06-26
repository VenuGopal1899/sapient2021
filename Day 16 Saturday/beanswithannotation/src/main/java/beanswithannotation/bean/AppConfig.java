package beanswithannotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beanswithannotation.service.DepartmentManager;
import beanswithannotation.service.DepartmentManagerImpl;
import beanswithannotation.service.EmployeeManager;
import beanswithannotation.service.EmployeeManagerImpl;

@Configuration

public class AppConfig {
	@Bean
	public EmployeeManager employeeManager() {
		return new EmployeeManagerImpl();
		
	}
	
	@Bean
	public DepartmentManager departmentManager() {
		return new DepartmentManagerImpl();
	}
}
