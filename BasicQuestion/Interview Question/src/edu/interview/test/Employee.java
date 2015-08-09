package edu.interview.test;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	int age;
	@Override
	public int compare(Employee paramT1, Employee paramT2) {
		// TODO Auto-generated method stub
		return (paramT1.age-paramT2.age);
	}

	
	

}
