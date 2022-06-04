package com.example.projekt.models;

import java.io.Serializable;
import java.util.Objects;

public class relationship implements Serializable {
    private users users;
    private games games;

    public relationship(com.example.projekt.models.users users, com.example.projekt.models.games games) {
        this.users = users;
        this.games = games;
    }
    public relationship() {

    }


    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        relationship pk = (relationship) o;
        return users.getId() == pk.users.getId() &&
                games.getIdg() == pk.games.getIdg() ;
    }





    public com.example.projekt.models.users getUsers() {
        return users;
    }

    public void setUsers(com.example.projekt.models.users users) {
        this.users = users;
    }

    public com.example.projekt.models.games getGames() {
        return games;
    }

    public void setGames(com.example.projekt.models.games games) {
        this.games = games;
    }
}
