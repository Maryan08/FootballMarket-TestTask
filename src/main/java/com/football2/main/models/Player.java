package com.football2.main.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
//import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlayer")
    private int idPlayer;

    @Column(name = "first_name")
    @NotNull
    private String first_name;

    @Column(name = "last_name")
    @NotNull
    private String last_name;

    @Column(name = "age")
    @NotNull
    private int age;

    @Column(name = "experience")
    @NotNull
    private int experience;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_team")
    private Team team;


}
