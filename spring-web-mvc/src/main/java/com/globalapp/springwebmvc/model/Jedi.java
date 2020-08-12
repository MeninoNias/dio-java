package com.globalapp.springwebmvc.model;

import javax.validation.constraints.NotBlank;

public class Jedi {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Name cannot be blank")
    private String lastName;

    public Jedi(String name, String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public Jedi() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
