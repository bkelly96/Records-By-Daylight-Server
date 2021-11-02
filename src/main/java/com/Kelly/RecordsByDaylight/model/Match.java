package com.Kelly.RecordsByDaylight.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Match {

    @Id //PrimaryKey
    @GeneratedValue //AutoIncrementId

    private Long id;
    private String charName;
    private String map;
    private String perk;
    private int score;
    private boolean hatchEscape;
    private Instant createdAt;

}
