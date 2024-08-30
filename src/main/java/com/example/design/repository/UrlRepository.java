package com.example.design.repository;


import com.example.design.model.Url;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UrlRepository extends MongoRepository<Url, String> {
    Optional<Url> findById(String id);
    Optional<Url> findByLongUrl(String longUrl);
}
