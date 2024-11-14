package com.example.design.controller;


import com.example.design.service.UrlShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/url")
public class UrlShortenerController {

    @Autowired
    private UrlShortenerService urlShortenerService;

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam String longUrl) {
        return urlShortenerService.shortenUrl(longUrl);
    }

    @GetMapping("/{shortUrlId}")
    public String getLongUrl(@PathVariable String shortUrlId) {
        Optional<String> longUrl = urlShortenerService.getLongUrl(shortUrlId);
        return longUrl.orElse("URL not found");
    }


}
