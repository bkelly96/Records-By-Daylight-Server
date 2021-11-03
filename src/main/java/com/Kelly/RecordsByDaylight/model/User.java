package com.Kelly.RecordsByDaylight.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id //Primary Key for Unique Users
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;

    public List<Match> getMatch() {
        return match;
    }

    public void setMatch(List<Match> match) {
        this.match = match;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matchId")
    private List<Match> match;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Loadout> loadout;

    public List<Loadout> getLoadout() {
        return loadout;
    }

    public void setLoadout(List<Loadout> loadout) {
        this.loadout = loadout;
    }
}
