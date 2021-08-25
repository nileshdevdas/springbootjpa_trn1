package com.cognizant.mvp.entitys;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PROJECT")
public class Project {
	@Id
	private Long pid;
	private String projectName;

	@ManyToMany(fetch = FetchType.LAZY, targetEntity = Employee.class)
	@JoinTable(name = "TBL_EMP_PROJ")
	private Set<Employee> employees;

	public Set<Employee> getEmployees() {
		return employees;
	}

	public Long getPid() {
		return pid;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
