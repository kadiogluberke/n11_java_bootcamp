package com.bkadioglu.springbootornek.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bkadioglu.springbootornek.entity.Project;
import com.bkadioglu.springbootornek.impl.ProjectServiceImpl;

@RestController
@RequestMapping(value = "/allprojects")
public class ProjectController {


    private final ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl) {
        this.projectServiceImpl = projectServiceImpl;
    }


    // @RequestMapping(value = "/allprojects", method = RequestMethod.GET)

    @GetMapping
    public List<Project> getAllProjects() {
        List<Project> liste =projectServiceImpl.getAll();
        return liste;
    }

    @PostMapping
    public ResponseEntity<Project> createProduct(@RequestBody Project project) {
        return ResponseEntity.ok(projectServiceImpl.save(project));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProductById(@PathVariable("id") Long projectId) {
        return ResponseEntity.ok(projectServiceImpl.getById(projectId));
    }

}
