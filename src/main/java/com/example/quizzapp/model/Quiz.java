package com.example.quizzapp.model;

import java.util.List;

public class Quiz {
    private Long id;
    private String titre;
    private String matiere;
    private List<Question> questions;
    
    public Quiz() {}
    
    public Quiz(String titre, String matiere, List<Question> questions) {
        this.titre = titre;
        this.matiere = matiere;
        this.questions = questions;
    }
    
    // Getters et Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitre() {
        return titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public String getMatiere() {
        return matiere;
    }
    
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }
    
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", matiere='" + matiere + '\'' +
                ", questions=" + (questions != null ? questions.size() : 0) +
                '}';
    }
}