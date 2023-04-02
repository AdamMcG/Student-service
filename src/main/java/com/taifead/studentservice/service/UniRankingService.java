package com.taifead.studentservice.service;

import com.taifead.studentservice.model.Ranking;
import org.springframework.data.domain.Page;

public interface UniRankingService {
    Page<Ranking> getRankings(Integer pageSize, Integer currentPage);
    Page<Ranking> searchRankings(String searchTerm, Integer pageSize, Integer currentPage);
    Ranking getRanking(String id);
}
