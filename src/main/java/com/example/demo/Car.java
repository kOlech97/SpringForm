package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="orders")

public class Car {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=50)
	private String make;
	
	@Column(nullable=false, length=50)
	private String car_model;
	
	@Column(length=120)
	private String problem;

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", car_model=" + car_model + ", problem=" + problem + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	
	
}
