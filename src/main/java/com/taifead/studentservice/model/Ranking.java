package com.taifead.studentservice.model;

import lombok.Data;

import java.util.Map;

@Data
public class Ranking {
    private String id;
    private String university;
    private Country country;
    private Map<String, Character> rankingPerYear;

}
