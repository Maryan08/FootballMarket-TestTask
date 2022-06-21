package com.football2.main.dao;

import com.football2.main.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerDAO extends JpaRepository<Player,Integer> {
}
