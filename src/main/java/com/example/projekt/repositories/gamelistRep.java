package com.example.projekt.repositories;


import com.example.projekt.models.gamelist;
import com.example.projekt.models.relationship;
import com.example.projekt.models.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface gamelistRep extends JpaRepository<gamelist, relationship> {

    List<gamelist> findAllByUsersOrderByPlaytimeDesc(users user);
    @Transactional
    void deleteByIdl(Long idl);
    @Transactional
    gamelist findByIdl(Long idl);
}