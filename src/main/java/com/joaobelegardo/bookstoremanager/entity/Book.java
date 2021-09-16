package com.joaobelegardo.bookstoremanager.entity;

import javax.persistence.*;

@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer charpters;

    @Column(nullable = false)
    private String isbn;


    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publishherName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn( name = "author_id")
    private Author author;


}
