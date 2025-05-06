package com.rest.api.grade.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "birth_date", nullable = false)
	private LocalDate birtDate;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String name, LocalDate birtDate) {
		super();
		this.id = id;
		this.name = name;
		this.birtDate = birtDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirtDate() {
		return birtDate;
	}

	public void setBirtDate(LocalDate birtDate) {
		this.birtDate = birtDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birtDate=" + birtDate + "]";
	}
	
	
}
