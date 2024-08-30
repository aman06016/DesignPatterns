package com.example.design.service;

import com.example.design.model.Url;
import com.example.design.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlShortenerService {

    @Autowired
    private UrlRepository urlRepository;

    public String shortenUrl(String longUrl) {
        Optional<Url> existingUrl = urlRepository.findByLongUrl(longUrl);
        if (existingUrl.isPresent()) {
            return existingUrl.get().getId();
        }

        Url url = new Url();
        url.setLongUrl(longUrl);
        url.setClickCount(0);

        url = urlRepository.save(url);

        String shortUrlId = Base62Encoder.encode(url.getId().hashCode());
        url.setId(shortUrlId);

        urlRepository.save(url);

        return shortUrlId;
    }

    public Optional<String> getLongUrl(String shortUrlId) {
        Optional<Url> url = urlRepository.findById(shortUrlId);
        url.ifPresent(u -> {
            u.setClickCount(u.getClickCount() + 1);
            urlRepository.save(u);
        });
        return url.map(Url::getLongUrl);
    }
}
