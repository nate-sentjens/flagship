package com.barinek.flagship.projects;

public class Project {
    private int id;
    private String name;

    public Project() {
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
