package com.crick.apis.service;


import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchSerivice {
    //get all matches
   List<Match> getAllMatches();




    // get cricket worldcup
    List<Match> getLiveMatches();



    //get CWC2023 point table
    List<List<String>> getPointTable();


}
