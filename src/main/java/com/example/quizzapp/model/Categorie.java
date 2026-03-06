package com.example.quizzapp.model;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private Long id;
    private String nom;
    private String description;
    private String icon;
    private List<Question> questions = new ArrayList<>();
    
    public Categorie() {}
    
    public Categorie(String nom, String description, String icon) {
        this.nom = nom;
        this.description = description;
        this.icon = icon;
    }
    
    // Getters et Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getIcon() {
        return icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }
    
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    public void ajouterQuestion(Question question) {
        this.questions.add(question);
    }
    
    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", questions=" + questions.size() +
                '}';
    }
}