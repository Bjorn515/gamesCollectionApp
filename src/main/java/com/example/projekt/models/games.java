package com.example.projekt.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "games", schema = "projektpaw")

public class games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idg;
    private String title;
    private String description;
    private String platform;

//    @OneToMany(mappedBy = "games")
//    private List<gamelist> gamelist;


    public Long getIdg() {
        return idg;
    }

    public void setIdg(Long idg) {
        this.idg = idg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o){

        if (o == this) {
            return true;
        }

        if (!(o instanceof games)) {
            return false;
        }


        games c = (games) o;

        return Long.compare(this.getIdg(),c.getIdg()) == 0;


    }

    @Override
    public String toString() {
        return "games{" +
                "idg=" + idg +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", platform='" + platform + '\'' +

                '}';
    }

    //    public games() {
//        super();
//    }
}