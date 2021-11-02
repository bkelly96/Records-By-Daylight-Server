package com.Kelly.RecordsByDaylight.service;


import com.Kelly.RecordsByDaylight.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.Request;
import org.springframework.stereotype.Service;
import com.Kelly.RecordsByDaylight.exception.RequestNotFoundException;

@Service
@AllArgsConstructor
public class RequestService {

    private final MatchRepository matchRepository;


    public Request getRequestById(long id){
        return matchRepository.findById(id).orElseThrow(() -> new RequestNotFoundException("No Request found with id + " + id));
    }

}
