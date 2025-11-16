package com.example;

public class Group {
    private String name;
    private Promotion promotion;

    public Group(String name, Promotion promotion) {
        this.name = name;
        this.promotion = promotion;
    }

    public String getName() { return name; }
    public Promotion getPromotion() { return promotion; }
    public void setName(String name) { this.name = name; }
    public void setPromotion(Promotion promotion) { this.promotion = promotion; }
    
}
