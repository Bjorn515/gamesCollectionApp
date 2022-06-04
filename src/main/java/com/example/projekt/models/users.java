package com.example.projekt.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users", schema = "projektpaw")

public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

//    @OneToMany(mappedBy = "users")
//    private List<gamelist> gamelist;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<com.example.projekt.models.gamelist> getGamelist() {
//        return gamelist;
//    }

//    public void setGamelist(List<com.example.projekt.models.gamelist> gamelist) {
//        this.gamelist = gamelist;
//    }

    @Override
    public String toString() {
        return "users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +

                '}';
    }

    @Override
    public boolean equals(Object o){

        if (o == this) {
            return true;
        }

        if (!(o instanceof users)) {
            return false;
        }


        users c = (users) o;

        return Long.compare(this.getId(),c.getId()) == 0;


    }

    //    public users() {
//        super();
//    }
}