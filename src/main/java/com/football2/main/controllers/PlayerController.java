package com.football2.main.controllers;

import com.football2.main.models.Player;
import com.football2.main.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/players")
@AllArgsConstructor
public class PlayerController {
    PlayerService playerService;

    @GetMapping("")
    public List<Player> findAll(){
        return playerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Player> findById(@PathVariable int id){
        return playerService.getById(id);
    }
    @PostMapping("")
    public List<Player> savePlayer(@RequestBody Player player){
        playerService.save(player);
        return playerService.findAll();
    }

    @DeleteMapping("/{id}")
    public List<Player> delete(@PathVariable int id){
        playerService.delete(id);
        return playerService.findAll();
    }
}
