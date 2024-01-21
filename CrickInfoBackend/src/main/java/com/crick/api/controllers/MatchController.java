package com.crick.api.controllers;

import com.crick.api.entities.Match;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crick.api.services.MatchService;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
 private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);    }

    @GetMapping("/pointTable")
    public ResponseEntity<?> getPointTable(){
return new ResponseEntity<>(this.matchService.getCWC2023PointTable(),HttpStatus.OK);
    }


}
