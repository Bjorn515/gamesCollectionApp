package com.example.projekt.models;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "gamelist")
//@IdClass(relationship.class)
public class gamelist  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idl;

    @ManyToOne
//    @JoinColumn(name = "idk")
    private users users;


    @ManyToOne
//    @JoinColumn(name = "idg")
    private games games;

    @Column(name = "playtime")
    private Integer playtime;

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

    public Integer getPlaytime() {
        return playtime;
    }

    public void setPlaytime(Integer playtime) {
        this.playtime = playtime;
    }

    @Override
    public String toString() {
        return "gamelist{" +
                "users=" + users +
                ", games=" + games +
                ", playtime=" + playtime +
                '}';
    }

    @Override
    public boolean equals(Object o){

        if (o == this) {
            return true;
        }

        if (!(o instanceof gamelist)) {
            return false;
        }


         gamelist c = (gamelist) o;

        return Long.compare(this.games.getIdg(),c.games.getIdg()) == 0
                && Long.compare(this.users.getId(),c.users.getId()) == 0;


    }
    //    public gamelist() {
//        super();
//    }

    public Long getIdl() {
        return idl;
    }

    public void setIdl(Long idl) {
        this.idl = idl;
    }
}