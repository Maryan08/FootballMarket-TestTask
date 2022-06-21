package com.football2.main.controllers;

import com.football2.main.models.Team;
import com.football2.main.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teams")
@AllArgsConstructor
public class TeamController {

    private TeamService teamService;

    @GetMapping("")
    public ResponseEntity<List<Team>>findAll(){
         ResponseEntity<List<Team>> response =new ResponseEntity<>(teamService.findAll(), HttpStatus.OK);
        return response;
    }
    @PostMapping("")
    public List<Team> saveTeam(@RequestBody Team team){
        teamService.save(team);
        return teamService.findAll();
    }

    @DeleteMapping("/{id}")
    public List<Team> deleteTeam(@PathVariable int id){
        teamService.delete(id);
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Team> findById(@PathVariable int id){
        return teamService.getById(id);
    }

}
