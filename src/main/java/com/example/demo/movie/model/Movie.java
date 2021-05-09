package com.example.demo.movie.model;

import com.example.demo.movie.enums.Category;


public class Movie {

    private long Id;
    private String Name;
    private Category.Categories Category;

    public Movie(String name, String category) {
        this.Id = 1;
        this.Name = name;
        this.Category = com.example.demo.movie.enums.Category.Categories.valueOf(category);
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public com.example.demo.movie.enums.Category.Categories getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = com.example.demo.movie.enums.Category.Categories.valueOf(category);
    }
}
