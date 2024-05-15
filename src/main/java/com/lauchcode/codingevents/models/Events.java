package com.lauchcode.codingevents.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Events {

    private int id;
    private static  int nextId = 1;


    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @Email(message = "Invalid email. Try again.")
    private String contactEmail;


    public Events(String name, String description, String contactEmail) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
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

    public @Email(message = "Invalid email. Try again.") String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email(message = "Invalid email. Try again.") String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
