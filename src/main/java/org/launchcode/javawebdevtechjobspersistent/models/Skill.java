package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    public Skill (){}

    @Size(max = 500, message = "Description too long!")
    @NotNull(message =  "Please include a brief description.")
    private String description;

    @ManyToMany(mappedBy =  "skills")
    private List<Job> jobs = new ArrayList<>();

    //getters and setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    //public Skill(String description) {
    //        this.description = description;
    //    }

    }
