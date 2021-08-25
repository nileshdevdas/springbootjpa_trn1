package com.cognizant.mvp.entitys;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_EMPLOYEE")
public class Employee {

	@Id
	private Long empid;
	private String empName;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dept_id")
	private Department department;

	@ManyToMany(fetch = FetchType.LAZY, targetEntity = Project.class)
	@JoinTable(name = "TBL_EMP_PROJ")
	@JoinColumn(name = "empid")
	private Set<Project> projects;

	@OneToOne(mappedBy = "employee")
	private Profile profile;

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public Department getDepartment() {
		return department;
	}

	public Long getEmpid() {
		return empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
