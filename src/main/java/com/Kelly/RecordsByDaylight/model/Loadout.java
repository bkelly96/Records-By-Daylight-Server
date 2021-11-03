package com.Kelly.RecordsByDaylight.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Loadout {

    @Id //Primary Key
    @GeneratedValue //Auto increments ID when a new Loadout is made

    private Long loadoutId;
    private String perk1;
    private String perk2;
    private String perk3;
    private String perk4;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="userId")
    private User userId;



}
