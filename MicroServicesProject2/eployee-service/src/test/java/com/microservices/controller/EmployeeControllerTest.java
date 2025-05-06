package com.microservices.controller;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.microservices.controller.EmployeeController;
import com.microservices.entity.Employee;
import com.microservices.repository.EmployeeRepository;

public class EmployeeControllerTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddEmployee() {
   
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("John Doe");

        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        ResponseEntity<Employee> response = employeeController.addEmployee(employee);

        // Verify the response
        assert(response.getStatusCode() == HttpStatus.CREATED);
        assert(response.getBody() == employee);
        // Add more assertions as per your requirement
    }

    @Test
    public void testGetEmployee() {
        // Create a sample employee object for testing
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("John Doe");
        // ...

        // Mock the behavior of the employeeRepository.findById() method
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));

        // Call the getEmployee() method
        ResponseEntity<Employee> response = employeeController.getEmployee(1L);

        // Verify the response
        assert(response.getStatusCode() == HttpStatus.OK);
        assert(response.getBody() == employee);
        // Add more assertions as per your requirement
    }

    @Test
    public void testGetAllEmployee() {
        // Create a list of sample employee objects for testing
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setId(1L);
        employee1.setName("John Doe");
        // ...
        Employee employee2 = new Employee();
        employee2.setId(2L);
        employee2.setName("Jane Smith");
        // ...
        employees.add(employee1);
        employees.add(employee2);

        // Mock the behavior of the employeeRepository.findAll() method
        when(employeeRepository.findAll()).thenReturn(employees);

        // Call the getAllEmployee() method
        ResponseEntity<List<Employee>> response = employeeController.getAllEmployee();

        // Verify the response
        assert(response.getStatusCode() == HttpStatus.OK);
        assert(response.getBody() == employees);
        // Add more assertions as per your requirement
    }

    @Test
    public void testFindByDepartment() {
        // Create a sample department ID for testing
        Long departmentId = 1L;

        // Create a list of sample employee objects for testing
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setId(1L);
        employee1.setName("John Doe");
        // ...
        Employee employee2 = new Employee();
        employee2.setId(2L);
        employee2.setName("Jane Smith");
        // ...
        employees.add(employee1);
        employees.add(employee2);

        // Mock the behavior of the employeeRepository.findByDepartment() method
        when(employeeRepository.findByDepartment(departmentId)).thenReturn(employees);

        // Call the findByDepartment() method
        ResponseEntity<List<Employee>> response = employeeController.findByDepartment(departmentId);
        
        // Verify the response
        assert(response.getStatusCode() == HttpStatus.OK);
        assert(response.getBody() == employees);
        // Add more assertions as per your requirement
    }
}


