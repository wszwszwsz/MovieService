package com.example.demo.movie.model;

import com.example.demo.movie.enums.Category;

public class Movie {

    private Long Id;
    private String Name;
    private Enum Category;

    public Movie(Long id, String name, Enum category) {
        Id = id;
        Name = name;
        Category = category;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Enum getCategory() {
        return Category;
    }

    public void setCategory(Enum category) {
        Category = category;
    }
}
