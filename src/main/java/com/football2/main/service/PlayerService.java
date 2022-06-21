package com.football2.main.service;

import com.football2.main.models.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    Optional<Player> getById(int id);
    void save(Player player);
    void delete (int id);
    List<Player> findAll();
}
