package com.Kelly.RecordsByDaylight.service;


import com.Kelly.RecordsByDaylight.model.Loadout;
import com.Kelly.RecordsByDaylight.model.Match;
import com.Kelly.RecordsByDaylight.model.User;
import com.Kelly.RecordsByDaylight.repository.LoadoutRepository;
import com.Kelly.RecordsByDaylight.repository.MatchRepository;
import com.Kelly.RecordsByDaylight.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.Kelly.RecordsByDaylight.exception.RequestNotFoundException;

import java.time.Instant;
import java.util.List;

@Service
@AllArgsConstructor
public class RequestService {

    private final MatchRepository matchRepository;

    private final LoadoutRepository loadoutRepository;

    private final UserRepository userRepository;

    public Match getMatchById(long id){
        return matchRepository.findById(id).orElseThrow(() -> new RequestNotFoundException("No Request found with id + " + id));
    }

    public void createMatch (Match match){
        match.setCreatedAt(Instant.now());
        matchRepository.save(match);
    }

    public void createLoadout(Loadout loadout){
        loadoutRepository.save(loadout);
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public String getPopularCharacter(){
        return matchRepository.findPopularCharacter();
    }

    public String getPopularMap(){
        return matchRepository.findPopularMap();
    }

    public String getPopularPerk1(){
        return matchRepository.findPopularPerk1();
    }

    public String getPopularPerk2(){
        return matchRepository.findPopularPerk2();
    }

    public String getPopularPerk3(){
        return matchRepository.findPopularPerk3();
    }

    public String getPopularPerk4(){
        return matchRepository.findPopularPerk4();
    }

}
