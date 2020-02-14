package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    public Employer () {}

    @NotBlank(message = "Location is required")
    @Size(min = 2, max = 99, message = "Location name must be between 2 and 99 characters")
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    //getters and setters

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //public Employer (String location){
    //        this.location = location;
    //    }//is this constructor necessary?
    }


