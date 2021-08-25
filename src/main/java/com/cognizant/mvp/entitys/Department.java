package com.cognizant.mvp.entitys;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_DEPARTMENT")
public class Department {

	@Id
	private Long deptid;
	private String departmentName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	private Set<Employee> employees;

	public String getDepartmentName() {
		return departmentName;
	}

	public Long getDeptid() {
		return deptid;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
