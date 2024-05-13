package com.lauchcode.codingevents.models;

import java.util.Objects;

public class Events {

    private int id;
    private static  int nextId = 1;

    private String name;
    private String description;


    public Events(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = nextId;
        nextId++;
    }



    @Override
    public String toString() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Events events)) return false;
        return id == events.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;


    }

    public int getId() {
        return id;
    }
}
