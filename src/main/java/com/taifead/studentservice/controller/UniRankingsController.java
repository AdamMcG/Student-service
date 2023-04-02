package com.taifead.studentservice.controller;

import com.taifead.studentservice.model.Ranking;
import com.taifead.studentservice.service.UniRankingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rankings")
@Api(value = "University Rankings", description = "University Rankings API")
public class UniRankingsController {

    private final UniRankingService uniRankingService;

    @Autowired
    public UniRankingsController(UniRankingService uniRankingService) {
        this.uniRankingService = uniRankingService;
    }

    @GetMapping("/rankings")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully retrieved list"),
            @io.swagger.annotations.ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @io.swagger.annotations.ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @io.swagger.annotations.ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<Page<Ranking>> getRankings(@RequestParam Integer pageSize,
                                                     @RequestParam Integer currentPage) {
            return ResponseEntity.ok(uniRankingService.getRankings(pageSize, currentPage));
    }

    @GetMapping("/rankings/{id}")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully retrieved list"),
            @io.swagger.annotations.ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @io.swagger.annotations.ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @io.swagger.annotations.ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<Ranking> getRanking(@RequestParam String id) {
            return ResponseEntity.ok(uniRankingService.getRanking(id));
    }

    @GetMapping("/rankings/search/{searchTerm}")
    @ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully retrieved list"),
            @io.swagger.annotations.ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @io.swagger.annotations.ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @io.swagger.annotations.ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<Page<Ranking>> searchRankings(@RequestParam String searchTerm, @RequestParam Integer pageSize,
                                                        @RequestParam Integer currentPage) {
        return ResponseEntity.ok(uniRankingService.searchRankings(searchTerm, pageSize, currentPage));
    }
}
