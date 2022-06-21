package com.football2.main.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class TransferDTO {
    private Player player;
    private Team newTeam;
    private Date data;

    public TransferDTO(Transfers transfer){
        this.player=transfer.getPlayer();
        this.newTeam=transfer.getNewTeam();
        this.data=transfer.getDateTransfer();
    }
}
