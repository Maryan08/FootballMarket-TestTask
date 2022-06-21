package com.football2.main.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transfer")
public class Transfers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTransfer")
    private int idTransfer;
    @Column(name = "sumTransfer")
    private Double sumTransfer;

    @Column(name="dateTransfer")
    private Date dateTransfer;
    @ManyToOne
    @JoinColumn(name = "idPlayer",referencedColumnName = "idPlayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "idNewTeam", referencedColumnName ="idTeam")
    private Team newTeam;

    @ManyToOne
    @JoinColumn(name = "idOldTeam", referencedColumnName ="idTeam")
    private Team oldTeam;


}
