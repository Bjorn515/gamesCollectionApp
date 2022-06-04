package com.example.projekt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projekt.models.users;
import com.example.projekt.repositories.usersRep;


import java.util.List;
import java.util.Optional;

@Service
public class usersService {
    @Autowired
    private usersRep repository;

    public List<users> findAll() {
        return repository.findAll();
    }

    public <S extends users> S save(S entity) {
        return repository.save(entity);
    }

    public Optional<users> findById(Long aLong) {
        return repository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

}