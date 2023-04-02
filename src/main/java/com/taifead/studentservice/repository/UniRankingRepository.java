package com.taifead.studentservice.repository;

import com.taifead.studentservice.documents.UniRankings;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UniRankingRepository extends MongoRepository<UniRankings, String> {
    public UniRankings findByUniName(String uniName);
}
