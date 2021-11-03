package com.Kelly.RecordsByDaylight.controller;


import com.Kelly.RecordsByDaylight.model.Loadout;
import com.Kelly.RecordsByDaylight.model.Match;
import com.Kelly.RecordsByDaylight.model.User;
import com.Kelly.RecordsByDaylight.service.RequestService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@AllArgsConstructor
@RequestMapping("/match")

public class MatchController {

    private final RequestService requestService;


    @GetMapping
    public ResponseEntity<String> getPopularCharacter(){
        return new ResponseEntity<String>(requestService.getPopularCharacter(), OK);
    }

    @GetMapping("/map")
    public ResponseEntity<String> getPopularMap(){
        return new ResponseEntity<String>(requestService.getPopularMap(), OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Match> getMatchById(@PathVariable long id){

        return new ResponseEntity<Match>(requestService.getMatchById(id), OK);

    }

    @GetMapping("/perk1")
    public ResponseEntity<String> getPopularPerk1(){
        return new ResponseEntity<String>(requestService.getPopularPerk1(), OK);
    }

    @GetMapping("/perk2")
    public ResponseEntity<String> getPopularPerk2(){
        return new ResponseEntity<String>(requestService.getPopularPerk2(), OK);
    }

    @GetMapping("/perk3")
    public ResponseEntity<String> getPopularPerk3(){
        return new ResponseEntity<String>(requestService.getPopularPerk3(), OK);
    }

    @GetMapping("/perk4")
    public ResponseEntity<String> getPopularPerk4(){
        return new ResponseEntity<String>(requestService.getPopularPerk4(), OK);
    }

    @PostMapping
    public ResponseEntity createMatch(@RequestBody Match match){
        requestService.createMatch(match);
        return new ResponseEntity(CREATED);
    }

    @PostMapping("/loadout")
    public ResponseEntity createLoadout(@RequestBody Loadout loadout){
        requestService.createLoadout(loadout);
        return new ResponseEntity(CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity createUser(@RequestBody User user){
        requestService.createUser(user);
        return new ResponseEntity(CREATED);
    }

}
