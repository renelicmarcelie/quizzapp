package com.example.quizzapp.model;

import java.util.List;

public class Question {
    private Long id;
    private String texte;
    private List<String> options;
    private String bonneReponse;
    private String reponseUtilisateur;
    private Quiz quiz;
    
    public Question() {}
    
    public Question(String texte, List<String> options, String bonneReponse) {
        this.texte = texte;
        this.options = options;
        this.bonneReponse = bonneReponse;
    }
    
    public Question(String texte, List<String> options, String bonneReponse, Quiz quiz) {
        this.texte = texte;
        this.options = options;
        this.bonneReponse = bonneReponse;
        this.quiz = quiz;
    }
    
    // Getters et Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTexte() {
        return texte;
    }
    
    public void setTexte(String texte) {
        this.texte = texte;
    }
    
    public List<String> getOptions() {
        return options;
    }
    
    public void setOptions(List<String> options) {
        this.options = options;
    }
    
    public String getBonneReponse() {
        return bonneReponse;
    }
    
    public void setBonneReponse(String bonneReponse) {
        this.bonneReponse = bonneReponse;
    }
    
    public String getReponseUtilisateur() {
        return reponseUtilisateur;
    }
    
    public void setReponseUtilisateur(String reponseUtilisateur) {
        this.reponseUtilisateur = reponseUtilisateur;
    }
    
    public Quiz getQuiz() {
        return quiz;
    }
    
    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
    
    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", texte='" + texte + '\'' +
                ", bonneReponse='" + bonneReponse + '\'' +
                ", reponseUtilisateur='" + reponseUtilisateur + '\'' +
                '}';
    }
}