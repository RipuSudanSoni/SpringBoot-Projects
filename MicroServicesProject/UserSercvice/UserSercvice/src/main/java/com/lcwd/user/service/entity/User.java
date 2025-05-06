package com.lcwd.user.service.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
@Table(name = "micro_users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private long userId;

	@Column(name = "name", length = 20)
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "about")
	private String about;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
	
	public User() {
		super();
	}
	public User(long userId, String name, String email, String about, List<Rating> ratings) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
		this.ratings = ratings;
	}

}
