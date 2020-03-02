package com.olc.poc.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	private int id;
	private String name;
	private int salary;
	private String city;

	public Employee() {

	}

	public Employee(String name, int salary, String city) {
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public Employee(int id, String name, int salary, String city) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

}
