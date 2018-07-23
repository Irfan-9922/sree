package com.ij;

import javax.jws.WebService;

@WebService
public class Employee {
	public Employeedemo getEmp(Employeedemo emp)
	{
		emp.getName();
		emp.getAddress();
		emp.getFname();
	return emp;
	}

}
