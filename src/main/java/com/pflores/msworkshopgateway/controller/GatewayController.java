package com.pflores.msworkshopgateway.controller;

import com.pflores.msworkshopgateway.client.IMarkets;
import com.pflores.msworkshopgateway.client.IRelatedArtists;
import com.pflores.msworkshopgateway.client.ITopTracks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/ms-workshop-gateway")
public class GatewayController {
    @Autowired
    private IMarkets marketsService;

    @Autowired
    private ITopTracks topTracksService;

    @Autowired
    private IRelatedArtists relatedArtistsService;

    @GetMapping("/ms-related-artists/{id}")
    public Map fetchRelatedArtists(@PathVariable(name = "id") String id) {
        return relatedArtistsService.fetchRelatedArtists(id);
    }

    @GetMapping("/ms-top-tracks/{id}")
    public Map fetchTopTracks(@PathVariable(name = "id") String id) {
        return topTracksService.fetchTopTracks(id);
    }

    @GetMapping("/ms-markets")
    public Map fetchMarkets() {
        return marketsService.fetchMarkets();
    }

}
