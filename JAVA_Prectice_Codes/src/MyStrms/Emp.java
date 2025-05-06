package MyStrms;

public class Emp {
	
	public int id;
	public String name;
	public String city;
	public double sal;
	
	
	public Emp() {
		super();
	}
	
	public Emp(int id, String name, String city, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", city=" + city + ", sal=" + sal + "]";
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	
	
}
