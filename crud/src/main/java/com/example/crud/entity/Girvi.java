package com.example.crud.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Girvi")
@Getter
@Setter
public class Girvi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "mobile_No")
	private Long mobileNo;
	
	@Column(name = "item_metal")
	private String itemMetal;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_weight")
	private Double itemWeight;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "rate")
	private int rate;
	
	@Column(name = "date")
	private Date date;
	
	

	@Override
	public String toString() {
		return "Girvi [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + ", itemMetal="
				+ itemMetal + ", itemName=" + itemName + ", itemWeight=" + itemWeight + ", amount=" + amount + ", rate="
				+ rate + ", date=" + date + "]";
	}

	public Girvi(int id, String name, String address, Long mobileNo, String itemMetal, String itemName,
			Double itemWeight, Double amount, int rate, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.itemMetal = itemMetal;
		this.itemName = itemName;
		this.itemWeight = itemWeight;
		this.amount = amount;
		this.rate = rate;
		this.date = date;
	}

	public Girvi() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
