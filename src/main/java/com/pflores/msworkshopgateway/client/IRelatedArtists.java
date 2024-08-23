package com.pflores.msworkshopgateway.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "ms-related-artists", url = "${ms-related-artists.url}")
public interface IRelatedArtists {


    @GetMapping("/artists/{id}/related-artists")
    Map<String, Object> fetchRelatedArtists(@PathVariable(name = "id") String id);
}
