package com.cognizant.mvp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.mvp.entitys.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
