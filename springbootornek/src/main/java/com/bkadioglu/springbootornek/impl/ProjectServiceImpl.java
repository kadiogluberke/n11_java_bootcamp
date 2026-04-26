package com.bkadioglu.springbootornek.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bkadioglu.springbootornek.entity.Project;
import com.bkadioglu.springbootornek.repository.ProjectRepository;
import com.bkadioglu.springbootornek.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {


    //constructor injection
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository)
    {
        this.projectRepository = projectRepository;
    }


    @Override
    public List<Project> getAll() {
        List<Project> projectList = projectRepository.findAll();
        return projectList;
    }

    @SuppressWarnings("null")
    @Override
    public Project getById(Long id) {
        Project project = projectRepository.findById(id).get();
        return project;
    }

    @Override
    public Project save(Project project) {
        if(project.getProjectCode()==null)
        {
            throw new IllegalArgumentException("hatalı kayıt");
        }
        //insert into Project(ProjectName,ProjectCode) values(project.getProject)
        Project projectDb= projectRepository.save(project);

        return projectDb;
    }

    @SuppressWarnings("unused")
    @Override
    public Project update(Project project) {
        //güncellenecek olan kaydı bul getir
        @SuppressWarnings("null")
        Project projectDb = projectRepository.getReferenceById(project.getId());
        if(projectDb==null)
        {
            throw new IllegalArgumentException("ilgili kayıt bulunamadı");
        }
        projectDb.setProjectCode(project.getProjectCode());
        projectDb.setProjectName(project.getProjectName());
        projectDb.setInsertDate(new Date());
        Project projectUpd = projectRepository.save(projectDb);

        return projectUpd;
    }

    @SuppressWarnings("null")
    @Override
    public Boolean delete(Long id) {
        projectRepository.deleteById(id);
        return true;
    }

}