package com.football2.main.service;

import com.football2.main.models.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    Optional<Team> getById(int id);
    void save(Team team);
    void delete (int id);
    List<Team> findAll();
}
