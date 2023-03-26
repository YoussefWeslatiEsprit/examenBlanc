package com.example.exam2.services;

import com.example.exam2.entities.Project;

import java.util.List;

public interface IProjectService {
    Project ajouterProject(Project p);
    void updateProject(Project p);
    List<Project> getAllProject();
    Project getByIdProject(Integer id);
    void deleteProject(Integer id);
}
