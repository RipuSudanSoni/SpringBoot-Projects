package Comprable;

class Employee implements Comparable<Employee>{
    
    private int id;
    private String name;
    private int age;
    private double sal;
    
    public Employee() {
    }
    
    public Employee(int id, String name, int age, double sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public int compareTo(Employee e) {
//        return Double.compare(this.sal, e.sal);
    	return this.name.compareTo(e.name);
    }
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for salary
    public double getSal() {
        return sal;
    }

    // Setter for salary
    public void setSal(double sal) {
        this.sal = sal;
    }

    // Overriding toString method to represent the Employee object as a string
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Age=" + age + ", Salary=" + sal + "]";
    }

}