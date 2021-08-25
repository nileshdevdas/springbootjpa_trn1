package com.cognizant.mvp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.mvp.entitys.Employee;
import com.cognizant.mvp.entitys.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

	public List<Profile> findByEmployee(Employee employee);

}
