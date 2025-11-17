package com.example;

import java.util.List;

import javax.swing.GroupLayout.Group;

public class Promotion {
    private String name;
    private List<Group> group;

    public Promotion(String name, List<Group> group) {
        this.name = name;
        this.group = group;
    }

    public String getName() { return name; }
    public List<Group> getGroup() { return group; }
    public void setName(String name) { this.name = name; }
    public void setGroup(List<Group> group) { this.group = group; }
}
