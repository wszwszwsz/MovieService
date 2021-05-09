package com.example.demo.movie.model;

import com.example.demo.movie.enums.CategoryEnum;
public class Movie {

    private Long Id;
    private String Name;
    private CategoryEnum.Category category;

    public Movie(){
    }

    public Movie(Long id, String name, CategoryEnum.Category category) {
        Id = id;
        Name = name;
        this.category = category;
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

    public CategoryEnum.Category getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum.Category category) {
        this.category = category;
    }
}
