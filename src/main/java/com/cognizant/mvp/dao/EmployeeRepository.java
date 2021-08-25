package com.cognizant.mvp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.mvp.entitys.Department;
import com.cognizant.mvp.entitys.Employee;
import com.cognizant.mvp.entitys.Profile;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("select e from Employee e where e.empName like ?1 ")
	public List<Employee> findAllActiveEmployees(String q1);

	public List<Employee> findByProfile(Profile profile);

	public List<Employee> findByDepartment(Department department);
}
