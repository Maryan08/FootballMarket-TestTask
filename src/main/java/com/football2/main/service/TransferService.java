package com.football2.main.service;

import com.football2.main.models.Player;
import com.football2.main.models.TransferDTO;
import com.football2.main.models.Transfers;

import java.util.List;
import java.util.Optional;

public interface TransferService {
    Optional<Transfers> getById(int id);
    void save(Transfers transfer);
    List<Transfers> findAll();
    List<Transfers> createNewTransfer(TransferDTO transferDTO);
}
