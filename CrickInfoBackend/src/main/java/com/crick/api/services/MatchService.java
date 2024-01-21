package com.crick.api.services;

import com.crick.api.entities.Match;

import java.util.List;

public interface MatchService {

    // get all
    List<Match> getAllMatches();
    //live matches
    List<Match> getLiveMatches();

    //points table
    List<List<String>> getCWC2023PointTable();

}
