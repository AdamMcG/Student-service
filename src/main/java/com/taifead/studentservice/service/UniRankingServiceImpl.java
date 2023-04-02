package com.taifead.studentservice.service;

import com.taifead.studentservice.model.Ranking;
import org.springframework.data.domain.Page;

public class UniRankingServiceImpl implements UniRankingService {
    @Override
    public Page<Ranking> getRankings(Integer pageSize, Integer currentPage) {
        return Page.empty();
    }

    @Override
    public Page<Ranking> searchRankings(String searchTerm, Integer pageSize, Integer currentPage) {
        return Page.empty();
    }

    @Override
    public Ranking getRanking(String id) {
        return new Ranking();
    }
}
