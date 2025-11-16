package com.example;

import java.util.List;

import javax.swing.GroupLayout.Group;

public class Promotion {
    private String name;
    private List<Group> groups;

    public Promotion(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() { return name; }
    public List<Groupe> getGroupes() { return groupes; }

    public void setName(String name) { this.name = name; }
    public void setGroupes(List<Groupe> groupes) { this.groupes = groupes; }
}
