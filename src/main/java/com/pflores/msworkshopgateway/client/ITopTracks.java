package com.pflores.msworkshopgateway.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "ms-top-tracks", url = "${ms-top-tracks.url}")
public interface ITopTracks {

    @GetMapping("/artists/{id}/top-tracks")
    Map<String, Object> fetchTopTracks(@PathVariable(name = "id") String id);
}
