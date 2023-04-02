package com.taifead.studentservice.documents;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.Year;

@Document(collection = "uni-ranking")
public class UniRankings {
    @MongoId
    private String id;
    private String university;
    private String country;
    private Year year;
    private Integer theRanking;
    private Integer qsRanking;
    private Integer arwuRanking;
    private Integer usnwrRanking;
    private Integer average;
    private Integer averageRanking;
}
