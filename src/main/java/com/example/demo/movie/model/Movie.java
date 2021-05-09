package com.example.demo.movie.model;

public class Movie {

    private Long Id;
    private String Name;
    private enum categories {HORROR, ACTION};

    public Movie(){

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
}
