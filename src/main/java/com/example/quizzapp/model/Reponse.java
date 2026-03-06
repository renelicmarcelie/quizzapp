package com.example.quizzapp.model;

public class Reponse {
    private Long id;
    private String texte;
    private boolean estCorrecte;
    private Question question;
    
    public Reponse() {}
    
    public Reponse(String texte, boolean estCorrecte) {
        this.texte = texte;
        this.estCorrecte = estCorrecte;
    }
    
    public Reponse(String texte, boolean estCorrecte, Question question) {
        this.texte = texte;
        this.estCorrecte = estCorrecte;
        this.question = question;
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
    
    public boolean isEstCorrecte() {
        return estCorrecte;
    }
    
    public void setEstCorrecte(boolean estCorrecte) {
        this.estCorrecte = estCorrecte;
    }
    
    public Question getQuestion() {
        return question;
    }
    
    public void setQuestion(Question question) {
        this.question = question;
    }
    
    @Override
    public String toString() {
        return "Reponse{" +
                "id=" + id +
                ", texte='" + texte + '\'' +
                ", estCorrecte=" + estCorrecte +
                '}';
    }
}