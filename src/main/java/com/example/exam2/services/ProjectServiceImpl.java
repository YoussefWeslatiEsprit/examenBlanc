package com.example.exam2.services;

import com.example.exam2.entities.Project;
import com.example.exam2.repositories.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProjectServiceImpl implements IProjectService{

    private final ProjectRepository projectRepository;

    @Override
    public Project ajouterProject(Project p) {
        return projectRepository.save(p);
    }

    @Override
    public void updateProject(Project p) {
        return projectRepository.findById(id);

    }

    @Override
    public List<Project> getAllProject() {
        return null;
    }

    @Override
    public Project getByIdProject(Integer id) {
        return null;
    }

    @Override
    public void deleteProject(Integer id) {

    }
}
