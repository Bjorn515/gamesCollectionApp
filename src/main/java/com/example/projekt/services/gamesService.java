package com.example.projekt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.projekt.models.games;
import com.example.projekt.repositories.gamesRep;


import java.util.List;
import java.util.Optional;

@Service
public class gamesService {
    @Autowired
    private gamesRep repository;

    public List<games> findAll() {
        return repository.findAll();
    }

    public <S extends games> S save(S entity) {
        return repository.save(entity);
    }

    public Optional<games> findById(Long aLong) {
        return repository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    public List<games> findAll(Sort title) {
        return repository.findAll(title);
    }

    public List<games> findAllPlatform(String platform) {
        return repository.findAllByPlatform(platform);
    }

    public List<games> search(String search) {
        return repository.search(search);
    }

    public List<games> findByTitleContainingIgnoreCase(String title){
        return repository.findByTitleContainingIgnoreCase(title);
    }



}