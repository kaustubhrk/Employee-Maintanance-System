package com.cg.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class EmployeeModel {

	@Id
	private int eid;
	@Column
	private String fname;
	@Column
	private String lname;
	@Temporal(value = TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date DOJ;
	@Temporal(value = TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date DOB;
	@Column
	private String pass;
	@Column
	private Grade grade;
	@Column
	private Gender gender;
	@Column
	private float salary;
	@Column
	private MaritalStatus maritalStatus;
	@Column
	private int managerId;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int geteid() {
		return eid;
	}

	public void seteid(int eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public EmployeeModel() {

	}

	public EmployeeModel(int eid, String fname, String lname, Date dOJ, Date dOB, String pass, Grade grade,
			Gender gender, float salary, MaritalStatus maritalStatus) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		DOJ = dOJ;
		DOB = dOB;
		this.grade = grade;
		this.gender = gender;
		this.salary = salary;
		this.maritalStatus = maritalStatus;
		this.pass = pass;

	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", DOJ=" + DOJ + ", DOB=" + DOB
				+ ", pass=" + pass + ", grade=" + grade + ", gender=" + gender + ", salary=" + salary
				+ ", maritalStatus=" + maritalStatus + "]";
	}
}
