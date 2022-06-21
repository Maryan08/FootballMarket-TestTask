package com.football2.main.dao;

import com.football2.main.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamDAO extends JpaRepository<Team,Integer>{

}
