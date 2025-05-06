package Reflection;

public class Person {
	public int id;
	public String name;
	public String mobNo;
	public String city;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String mobNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.city = city;
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
	
	public String getInfo() {
		
		return "Person Information is ......"; 
	}
}
