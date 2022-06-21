package com.football2.main.service.Impl;

import com.football2.main.dao.PlayerDAO;
import com.football2.main.models.Player;
import com.football2.main.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerDAO playerDAO;
    @Override
    public Optional<Player> getById(int id) {
        return playerDAO.findById(id);
    }

    @Override
    public void save(Player player) {
        playerDAO.save(player);
    }

    @Override
    public void delete(int id) {
        playerDAO.deleteById(id);
    }

    @Override
    public List<Player> findAll() {
        return playerDAO.findAll();
    }
}
