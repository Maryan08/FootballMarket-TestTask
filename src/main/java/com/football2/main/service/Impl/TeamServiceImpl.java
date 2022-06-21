package com.football2.main.service.Impl;

import com.football2.main.dao.TeamDAO;
import com.football2.main.models.Team;
import com.football2.main.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamDAO teamDAO;
    @Override
    public Optional<Team> getById(int id) {
        return teamDAO.findById(id);
    }

    @Override
    public void save(Team team) {
        teamDAO.save(team);
    }

    @Override
    public void delete(int id) {
        teamDAO.deleteById(id);
    }

    @Override
    public List<Team> findAll() {
        return teamDAO.findAll();
    }
}
