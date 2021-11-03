package com.Kelly.RecordsByDaylight.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Match")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Match {

    @Id //PrimaryKey

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchId;
    private String charName;
    private String map;
    private String perk1;
    private String perk2;
    private String perk3;
    private String perk4;
    private int score;
    private boolean hatchEscape;
    private Instant createdAt;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userId")
    private User userId;

}
