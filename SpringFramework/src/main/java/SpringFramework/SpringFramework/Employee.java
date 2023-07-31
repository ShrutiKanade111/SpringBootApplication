package SpringFramework.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	Department dept;
	String empName;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

}
