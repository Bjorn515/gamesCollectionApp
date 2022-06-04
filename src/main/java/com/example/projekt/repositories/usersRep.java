package com.example.projekt.repositories;


import com.example.projekt.models.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface usersRep extends JpaRepository<users, Long> {


    Optional<users> findByEmail(String username);

}