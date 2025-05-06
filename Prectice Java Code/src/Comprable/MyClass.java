package Comprable;

//Sort a List of employees by their salary using Comparator.

import java.util.*;

public class MyClass{
public static void main(String args[]) {

List<Employee> list = new ArrayList<>();
list.add(new Employee(103, "Hari", 45, 45000));
list.add(new Employee(128, "Ravi", 25, 105000));
list.add(new Employee(178, "Radhey", 35, 65000));
list.add(new Employee(101, "Golu", 44, 35000));


System.out.println("Before sorting >>>>>>>>");
for(Employee emp: list) {
    System.out.println(emp);
}

Collections.sort(list);

System.out.println("After sorting >>>>>>>>");
for(Employee emp: list) {
    System.out.println(emp);
}
}
}