package com.example.quizzapp.controller;

import com.example.quizzapp.model.Quiz;
import com.example.quizzapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/form")
    public String showQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz());
        return "quiz-form";
    }

    @PostMapping("/generate")
    public String generateQuiz(@RequestParam String matiere, 
                              @RequestParam int nombreQuestions, 
                              Model model) {
        Quiz quiz = quizService.genererQuiz(matiere, nombreQuestions);
        model.addAttribute("quiz", quiz);
        return "quiz";
    }

   @PostMapping("/submit")
public String submitQuiz(@ModelAttribute Quiz quiz, Model model) {
    // Assurez-vous que le quiz n'est pas null
    if (quiz == null || quiz.getQuestions() == null) {
        return "redirect:/quiz/form";
    }
    
    int score = quizService.calculerScore(quiz);
    model.addAttribute("score", score);
    model.addAttribute("total", quiz.getQuestions().size());
    return "resultat";
}
}