package com.jspiders.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empno")
	private int empno;
	
	@Column(name = "ename")
	private String ename;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name = "job")
	private String job;
	
	@Column(name ="contact")
	private long contact;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", job=" + job + ", contact="
				+ contact + ", getEmpno()=" + getEmpno() + ", getEname()=" + getEname() + ", getSalary()=" + getSalary()
				+ ", getJob()=" + getJob() + ", getContact()=" + getContact() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
