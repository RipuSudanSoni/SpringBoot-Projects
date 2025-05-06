package Java8Features;

public class Emp {

	private int EmpId;
	private String name;
	private int age;
	private double sal;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String name, int age, double sal) {
		super();
		EmpId = empId;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [EmpId=" + EmpId + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
}
