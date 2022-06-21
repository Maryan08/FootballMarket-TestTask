package com.football2.main.controllers;

import com.football2.main.dao.TransferDAO;
import com.football2.main.models.TransferDTO;
import com.football2.main.models.Transfers;
import com.football2.main.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transfers")
@AllArgsConstructor
public class TransferController {
    TransferService transferService;

    @GetMapping("")
    public List<Transfers> findAll(){
        return transferService.findAll();
    }

    @PostMapping("")
    public List<Transfers> createTransfer(@RequestBody TransferDTO transferDTO){
        return transferService.createNewTransfer(transferDTO);
    }
}
