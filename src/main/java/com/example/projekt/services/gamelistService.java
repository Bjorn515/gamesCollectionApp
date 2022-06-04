package com.example.projekt.services;

import com.example.projekt.models.games;
import com.example.projekt.models.relationship;
import com.example.projekt.models.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projekt.models.gamelist;
import com.example.projekt.repositories.gamelistRep;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class gamelistService {
    @Autowired
    private gamelistRep repository;

    public List<gamelist> findAll() {
        return repository.findAll();
    }

    public <S extends gamelist> S save(S entity) {
        return repository.save(entity);
    }

    public Optional<gamelist> findById(relationship relationships) {
        return repository.findById(relationships);
    }

//    //public void deleteById(relationship relationships) {
//        repository.deleteById(relationships);
//    }
    @Transactional
    public void deleteByIdl(Long idl){
        repository.deleteByIdl(idl);
    }
    @Transactional
    public gamelist findByIdl(Long idl){
        return repository.findByIdl(idl);
    }

    public List<gamelist> findAllByUsersOrderByPlaytimeDesc(users user){
        return repository.findAllByUsersOrderByPlaytimeDesc(user);
    }




}