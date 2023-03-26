package com.example.exam2.services;

import com.example.exam2.entities.Sprint;

import java.util.List;

public interface ISprintService {
    void ajouterSprint(Sprint d);
    void updateSprint(Sprint d);
    List<Sprint> getAllSprint();
    Sprint getByIdSprint(Integer id);
    void deleteSprint(Integer id);
}
