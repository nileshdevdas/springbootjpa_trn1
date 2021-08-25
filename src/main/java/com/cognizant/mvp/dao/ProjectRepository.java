package com.cognizant.mvp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.mvp.entitys.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
