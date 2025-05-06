package week1.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class SortingEmp {
        
        public static <T extends Employee> void main(String[] args) {
            
            List<T> list = new ArrayList<T>();
            T emp1 = (T) new Employee(1, "Ripu", 180000L ,LocalDate.of(2020, 1, 1));
            T emp2 = (T) new Employee(2, "Muzammil", 50000L ,LocalDate.of(2020, 2, 1));
            T emp3 = (T) new Employee(3, "chandra", 5000L ,LocalDate.of(2020, 9, 1));
            T emp4 = (T) new Employee(4, "Ravi", 60000L ,LocalDate.of(2020, 1, 6));
            T emp5 = (T) new Employee(5, "Vinod", 40000L ,LocalDate.of(2020, 8, 8));
        
            list.add(emp1);
            list.add(emp2);
            list.add(emp3);
            list.add(emp4);
            list.add(emp5);
            
            // Sort employees by salary in ascending 
            List<T> sortedBySalaryAsc = list.stream()
                    .sorted(Comparator.comparing(Employee::getSal))
                    .toList();
            System.out.println("Sorted by salary (ascending): " + sortedBySalaryAsc);
            // Sort employees by name in descending
            List<T> sortedByNameDesc = list.stream()
                    .sorted(Comparator.comparing(Employee::getName).reversed())
                    .toList();
            System.out.println("Sorted by name (descending): " + sortedByNameDesc);
            // Sort employees by joining date 
            List<T> sortedByJoiningDateAsc = list.stream()
                    .sorted(Comparator.comparing(Employee::getJoiningDate))
                    .toList();
            System.out.println("Sorted by joining date (ascending): " + sortedByJoiningDateAsc);
        }
    }