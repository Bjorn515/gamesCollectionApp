package com.example.projekt.security;

import com.example.projekt.models.users;
import com.example.projekt.repositories.usersRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    usersRep repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<users> user = repository.findByEmail(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found:" + username));

        return user.map(MyUserDetails::new).get();
    }
}
