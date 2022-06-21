package com.football2.main.service.Impl;

import com.football2.main.dao.PlayerDAO;
import com.football2.main.dao.TeamDAO;
import com.football2.main.dao.TransferDAO;
import com.football2.main.models.Player;
import com.football2.main.models.Team;
import com.football2.main.models.TransferDTO;
import com.football2.main.models.Transfers;
import com.football2.main.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    TransferDAO transferDAO;
    @Autowired
    PlayerDAO playerDAO;
    @Autowired
    TeamDAO teamDAO;


    @Override
    public Optional<Transfers> getById(int id) {
        return transferDAO.findById(id);
    }

    @Override
    public void save(Transfers transfer) {

        transferDAO.save(transfer);
    }

    @Override
    public List<Transfers> findAll() {
        return transferDAO.findAll();
    }

    @Override
    public List<Transfers> createNewTransfer(TransferDTO transferDTO) {


        Player player = transferDTO.getPlayer();
        Team newTeam = transferDTO.getNewTeam();
        Team oldTeam = transferDTO.getPlayer().getTeam();
        player.setTeam(newTeam);
        newTeam.setBudget(newTeam.getBudget() - (((player.getExperience() * 100000) / player.getAge()) + ((((player.getExperience() * 100000) / player.getAge()) * newTeam.getCommission()) / 100)));
        oldTeam.setBudget(oldTeam.getBudget() + (((player.getExperience() * 100000) / player.getAge()) + ((((player.getExperience() * 100000) / player.getAge()) * newTeam.getCommission()) / 100)));

        teamDAO.save(newTeam);
        teamDAO.save(oldTeam);
        playerDAO.save(player);

        Transfers transfer = new Transfers();
        transfer.setDateTransfer(transferDTO.getData());
        transfer.setNewTeam(newTeam);
        transfer.setPlayer(player);
        transfer.setOldTeam(oldTeam);
        transfer.setSumTransfer((double) (((player.getExperience() * 100000) / player.getAge()) + ((((player.getExperience() * 100000) / player.getAge()) * newTeam.getCommission()) / 100)));
        transferDAO.save(transfer);
        return transferDAO.findAll();
    }
}
