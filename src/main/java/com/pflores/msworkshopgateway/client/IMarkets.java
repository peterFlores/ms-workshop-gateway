package com.pflores.msworkshopgateway.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "ms-markets-tracks", url = "${ms-markets.url}")
public interface IMarkets {

    @GetMapping("/markets")
    Map<String, Object> fetchMarkets();
}
