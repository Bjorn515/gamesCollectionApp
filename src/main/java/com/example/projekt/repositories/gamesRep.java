package com.example.projekt.repositories;


import com.example.projekt.models.games;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface gamesRep extends JpaRepository<games, Long> {

    @Query(
            value = "SELECT * FROM projektpaw.games WHERE"
            + "MATCH(title)"
            + "AGAINST (?1)",
            nativeQuery = true)
    List<games> search(String search);
    List<games> findAllByPlatform(String platform);
    List<games> findByTitleContainingIgnoreCase(String title);
}