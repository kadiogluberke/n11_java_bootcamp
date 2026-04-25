package com.bkadioglu.springbootornek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bkadioglu.springbootornek.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {

}
