package com.microservices.controller;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.microservices.controller.DepartmentController;
import com.microservices.entity.Department;
import com.microservices.entity.Employee;
import com.microservices.externalClientServices.EmployeeClient;
import com.microservices.repository.DepartmentRepository;

public class DepartmentControllerTest {
    private DepartmentRepository departmentRepository;
    private EmployeeClient employeeClient;
    private DepartmentController departmentController;

    @BeforeEach
    public void setUp() {
        departmentRepository = mock(DepartmentRepository.class);
        employeeClient = mock(EmployeeClient.class);
       // departmentController = new DepartmentController(employeeClient, departmentRepository);
    }

    @Test
    public void testAddDepartment() {
        Department department = new Department();
        department.setId(1L);
        department.setName("IT");

        when(departmentRepository.save(any(Department.class))).thenReturn(department);

        ResponseEntity<Department> response = departmentController.addDepartment(department);

        verify(departmentRepository, times(1)).save(any(Department.class));
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(department, response.getBody());
    }

    @Test
    public void testGetDepartment() {
        Department department = new Department();
        department.setId(1L);
        department.setName("IT");

        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));

        ResponseEntity<Department> response = departmentController.getDepartment(1L);

        verify(departmentRepository, times(1)).findById(1L);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(department, response.getBody());
    }

    @Test
    public void testGetAllDepartment() {
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(1L, "IT"));
        departments.add(new Department(2L, "HR"));

        when(departmentRepository.findAll()).thenReturn(departments);

        ResponseEntity<List<Department>> response = departmentController.getAllDepartment();

        verify(departmentRepository, times(1)).findAll();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(departments, response.getBody());
    }

//    @Test
//    public void testFindAllDepartmentWithEmployees() {
//        Department department1 = new Department(1L, "IT");
//        Department department2 = new Department(2L, "HR");
//
//        List<Department> departments = new ArrayList<>();
//        departments.add(department1);
//        departments.add(department2);
//
//        List<Employee> employees1 = new ArrayList<>();
//        employees1.add(new Employee(1L, "John", 1L));
//        employees1.add(new Employee(2L, "Jane", 1L));
//
//        List<Employee> employees2 = new ArrayList<>();
//        employees2.add(new Employee(3L, "Mike", 2L));
//        employees2.add(new Employee(4L, "Sarah", 2L));
//
//        when(departmentRepository.findAll()).thenReturn(departments);
//        when(employeeClient.findByDepartment(1L)).thenReturn(employees1);
//        when(employeeClient.findByDepartment(2L)).thenReturn(employees2);
//
//        ResponseEntity<List<Department>> response = departmentController.FindAllDepartmentWithEmployees();
//
//        verify(departmentRepository, times(1)).findAll();
//        verify(employeeClient, times(1)).findByDepartment(1L);
//        verify(employeeClient, times(1)).findByDepartment(2L);
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(departments, response.getBody());
//
//        // Check if employees are set for each department
//        assertEquals(employees1, response.getBody().get(0).getEmployees());
//        assertEquals(employees2, response.getBody().get(1).getEmployees());
//    }
}

