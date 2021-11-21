package com.karzkowiak.ocrsystem;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "graphic")
public class Graphic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;
    private String content;

    private Graphic(String url, String content) {
        this.url = url;
        this.content = content;
    }


    public static Graphic create(String url, String content) {
        return new Graphic(url, content);
    }

}




























