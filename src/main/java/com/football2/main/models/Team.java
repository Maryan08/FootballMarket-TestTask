package com.football2.main.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTeam")
    private int idTeam;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "owner")
    @NotNull
    private String owner;

    @Column(name = "budget")
    @NotNull
    private Double budget;

    @Column(name = "commission")
    @NotNull
    private int commission;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "team")
//    private List<Player> players;

}
