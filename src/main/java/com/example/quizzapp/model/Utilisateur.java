package com.example.quizzapp.model;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private List<Quiz> quizRealises = new ArrayList<>();
    private int scoreTotal;
    private int nombreQuizRealises;
    
    public Utilisateur() {}
    
    public Utilisateur(String nom, String email, String motDePasse) {
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getMotDePasse() {
        return motDePasse;
    }
    
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    public List<Quiz> getQuizRealises() {
        return quizRealises;
    }
    
    public void setQuizRealises(List<Quiz> quizRealises) {
        this.quizRealises = quizRealises;
    }
    
    public int getScoreTotal() {
        return scoreTotal;
    }
    
    public void setScoreTotal(int scoreTotal) {
        this.scoreTotal = scoreTotal;
    }
    
    public int getNombreQuizRealises() {
        return nombreQuizRealises;
    }
    
    public void setNombreQuizRealises(int nombreQuizRealises) {
        this.nombreQuizRealises = nombreQuizRealises;
    }
    
    // Méthodes utilitaires
    public void ajouterQuiz(Quiz quiz, int score) {
        this.quizRealises.add(quiz);
        this.scoreTotal += score;
        this.nombreQuizRealises++;
    }
    
    public double getMoyenneScore() {
        if (nombreQuizRealises == 0) return 0;
        return (double) scoreTotal / nombreQuizRealises;
    }
    
    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", scoreTotal=" + scoreTotal +
                ", nombreQuizRealises=" + nombreQuizRealises +
                '}';
    }
}