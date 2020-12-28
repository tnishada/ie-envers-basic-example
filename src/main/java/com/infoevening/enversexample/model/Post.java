package com.infoevening.enversexample.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ie_post")
@Audited
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String body;

    public Post() {}

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
}
