package week1.generics;

import java.time.LocalDate;

public class Employee {
	
	public int id;
	public String name;
	public double sal;
	public LocalDate joiningDate;
	
	
	public Employee(int id, String name, double sal, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.joiningDate = joiningDate;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public LocalDate getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", joiningDate=" + joiningDate + "]";
	}

	
}
