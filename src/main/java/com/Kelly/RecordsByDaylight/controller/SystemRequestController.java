package com.Kelly.RecordsByDaylight.controller;


import com.Kelly.RecordsByDaylight.service.RequestService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping
public class SystemRequestController {

    private final RequestService requestService;

    @GetMapping("/{id}")
    public ResponseEntity<Request> getRequestById(@PathVariable long id){

        Request request = requestService.getRequestById(id);
        return new ResponseEntity<Request>(requestService.getRequestById(id), OK);

    }
    
}
