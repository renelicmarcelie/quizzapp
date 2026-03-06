package com.example.quizzapp.service;

import com.example.quizzapp.model.Question;
import com.example.quizzapp.model.Quiz;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class QuizService {

    private final Map<String, List<Question>> banqueQuestions = new HashMap<>();

    public QuizService() {
        initialiserBanqueQuestions();
    }

    private void initialiserBanqueQuestions() {
        // ==================== QUESTIONS D'ANGLAIS ====================
        List<Question> anglais = Arrays.asList(
            // Vocabulaire de base
            new Question("Quelle est la traduction de 'Bonjour' ?", 
                Arrays.asList("Hello", "Goodbye", "Morning", "Night"), "Hello"),
            new Question("Comment dit-on 'Merci' en anglais ?", 
                Arrays.asList("Please", "Sorry", "Thank you", "Welcome"), "Thank you"),
            new Question("Comment dit-on 'S'il vous plaît' en anglais ?", 
                Arrays.asList("Please", "Thank you", "Sorry", "Excuse me"), "Please"),
            new Question("Comment dit-on 'Pardon' en anglais ?", 
                Arrays.asList("Sorry", "Please", "Thanks", "Hello"), "Sorry"),
            new Question("Comment dit-on 'Au revoir' en anglais ?", 
                Arrays.asList("Goodbye", "Hello", "Hi", "Bye bye"), "Goodbye"),
            
            // Les jours de la semaine
            new Question("Comment dit-on 'Lundi' en anglais ?", 
                Arrays.asList("Monday", "Tuesday", "Wednesday", "Sunday"), "Monday"),
            new Question("Comment dit-on 'Mercredi' en anglais ?", 
                Arrays.asList("Wednesday", "Tuesday", "Thursday", "Monday"), "Wednesday"),
            new Question("Comment dit-on 'Samedi' en anglais ?", 
                Arrays.asList("Saturday", "Sunday", "Friday", "Monday"), "Saturday"),
            
            // Les mois
            new Question("Comment dit-on 'Janvier' en anglais ?", 
                Arrays.asList("January", "February", "March", "April"), "January"),
            new Question("Comment dit-on 'Juillet' en anglais ?", 
                Arrays.asList("July", "June", "August", "May"), "July"),
            new Question("Comment dit-on 'Décembre' en anglais ?", 
                Arrays.asList("December", "November", "October", "September"), "December"),
            
            // Les verbes irréguliers
            new Question("Quel est le passé de 'go' ?", 
                Arrays.asList("Went", "Goed", "Gone", "Going"), "Went"),
            new Question("Quel est le passé de 'eat' ?", 
                Arrays.asList("Ate", "Eated", "Eaten", "Eating"), "Ate"),
            new Question("Quel est le passé de 'drink' ?", 
                Arrays.asList("Drank", "Drinked", "Drunk", "Drinking"), "Drank"),
            new Question("Quel est le passé de 'see' ?", 
                Arrays.asList("Saw", "Seen", "Seeed", "Seeing"), "Saw"),
            new Question("Quel est le participe passé de 'write' ?", 
                Arrays.asList("Written", "Wrote", "Writed", "Writing"), "Written"),
            
            // Les couleurs
            new Question("Comment dit-on 'Rouge' en anglais ?", 
                Arrays.asList("Red", "Blue", "Green", "Yellow"), "Red"),
            new Question("Comment dit-on 'Bleu' en anglais ?", 
                Arrays.asList("Blue", "Red", "Green", "Black"), "Blue"),
            new Question("Comment dit-on 'Vert' en anglais ?", 
                Arrays.asList("Green", "Red", "Blue", "Yellow"), "Green"),
            new Question("Comment dit-on 'Jaune' en anglais ?", 
                Arrays.asList("Yellow", "Red", "Blue", "Green"), "Yellow"),
            
            // Les nombres
            new Question("Comment dit-on 'Dix' en anglais ?", 
                Arrays.asList("Ten", "Twenty", "Twelve", "Eleven"), "Ten"),
            new Question("Comment dit-on 'Vingt' en anglais ?", 
                Arrays.asList("Twenty", "Ten", "Twelve", "Eleven"), "Twenty"),
            new Question("Comment dit-on 'Cent' en anglais ?", 
                Arrays.asList("One hundred", "One thousand", "One million", "Ten"), "One hundred"),
            
            // Questions grammaticales
            new Question("Quel est l'article indéfini pour un mot commençant par une consonne ?", 
                Arrays.asList("A", "An", "The", "None"), "A"),
            new Question("Quel est l'article indéfini pour un mot commençant par une voyelle ?", 
                Arrays.asList("An", "A", "The", "None"), "An"),
            new Question("Comment forme-t-on le pluriel de 'child' ?", 
                Arrays.asList("Children", "Childs", "Childrens", "Childes"), "Children"),
            new Question("Comment forme-t-on le pluriel de 'mouse' ?", 
                Arrays.asList("Mice", "Mouses", "Mices", "Mouse"), "Mice"),
            
            // Expressions courantes
            new Question("Que signifie 'How are you?' ?", 
                Arrays.asList("Comment allez-vous ?", "Qui êtes-vous ?", "Où êtes-vous ?", "Que faites-vous ?"), "Comment allez-vous ?"),
            new Question("Que signifie 'What time is it?' ?", 
                Arrays.asList("Quelle heure est-il ?", "Quel jour sommes-nous ?", "Quelle date ?", "Quand ?"), "Quelle heure est-il ?"),
            new Question("Que signifie 'Where do you live?' ?", 
                Arrays.asList("Où habitez-vous ?", "Que faites-vous ?", "Comment vivez-vous ?", "Pourquoi vivez-vous ?"), "Où habitez-vous ?"),
            
            // Métiers
            new Question("Comment dit-on 'Médecin' en anglais ?", 
                Arrays.asList("Doctor", "Teacher", "Lawyer", "Engineer"), "Doctor"),
            new Question("Comment dit-on 'Professeur' en anglais ?", 
                Arrays.asList("Teacher", "Doctor", "Professor", "Instructor"), "Teacher"),
            new Question("Comment dit-on 'Ingénieur' en anglais ?", 
                Arrays.asList("Engineer", "Architect", "Scientist", "Technician"), "Engineer"),
            
            // Famille
            new Question("Comment dit-on 'Mère' en anglais ?", 
                Arrays.asList("Mother", "Father", "Sister", "Brother"), "Mother"),
            new Question("Comment dit-on 'Père' en anglais ?", 
                Arrays.asList("Father", "Mother", "Son", "Daughter"), "Father"),
            new Question("Comment dit-on 'Sœur' en anglais ?", 
                Arrays.asList("Sister", "Brother", "Mother", "Father"), "Sister"),
            new Question("Comment dit-on 'Frère' en anglais ?", 
                Arrays.asList("Brother", "Sister", "Son", "Daughter"), "Brother"),
            
            // Nourriture
            new Question("Comment dit-on 'Pain' en anglais ?", 
                Arrays.asList("Bread", "Butter", "Cheese", "Milk"), "Bread"),
            new Question("Comment dit-on 'Eau' en anglais ?", 
                Arrays.asList("Water", "Milk", "Juice", "Soda"), "Water"),
            new Question("Comment dit-on 'Fromage' en anglais ?", 
                Arrays.asList("Cheese", "Butter", "Yogurt", "Cream"), "Cheese"),
            new Question("Comment dit-on 'Pomme' en anglais ?", 
                Arrays.asList("Apple", "Orange", "Banana", "Pear"), "Apple")
        );

        // ==================== QUESTIONS DE MATHÉMATIQUES ====================
        List<Question> maths = Arrays.asList(
            // Additions simples
            new Question("Combien font 5 + 7 ?", 
                Arrays.asList("12", "11", "13", "10"), "12"),
            new Question("Combien font 8 + 6 ?", 
                Arrays.asList("14", "13", "15", "12"), "14"),
            new Question("Combien font 9 + 7 ?", 
                Arrays.asList("16", "15", "17", "14"), "16"),
            new Question("Combien font 15 + 8 ?", 
                Arrays.asList("23", "22", "24", "21"), "23"),
            new Question("Combien font 24 + 17 ?", 
                Arrays.asList("41", "40", "42", "39"), "41"),
            
            // Soustractions
            new Question("Combien font 15 - 7 ?", 
                Arrays.asList("8", "7", "9", "6"), "8"),
            new Question("Combien font 20 - 8 ?", 
                Arrays.asList("12", "11", "13", "10"), "12"),
            new Question("Combien font 30 - 12 ?", 
                Arrays.asList("18", "17", "19", "16"), "18"),
            new Question("Combien font 45 - 23 ?", 
                Arrays.asList("22", "21", "23", "20"), "22"),
            new Question("Combien font 100 - 45 ?", 
                Arrays.asList("55", "54", "56", "53"), "55"),
            
            // Multiplications
            new Question("Combien font 8 x 7 ?", 
                Arrays.asList("56", "54", "58", "52"), "56"),
            new Question("Combien font 6 x 9 ?", 
                Arrays.asList("54", "52", "56", "50"), "54"),
            new Question("Combien font 7 x 8 ?", 
                Arrays.asList("56", "54", "58", "52"), "56"),
            new Question("Combien font 9 x 9 ?", 
                Arrays.asList("81", "80", "82", "79"), "81"),
            new Question("Combien font 12 x 8 ?", 
                Arrays.asList("96", "94", "98", "92"), "96"),
            
            // Divisions
            new Question("Combien font 72 ÷ 8 ?", 
                Arrays.asList("9", "8", "7", "10"), "9"),
            new Question("Combien font 81 ÷ 9 ?", 
                Arrays.asList("9", "8", "7", "10"), "9"),
            new Question("Combien font 56 ÷ 7 ?", 
                Arrays.asList("8", "7", "9", "6"), "8"),
            new Question("Combien font 144 ÷ 12 ?", 
                Arrays.asList("12", "11", "13", "10"), "12"),
            new Question("Combien font 100 ÷ 4 ?", 
                Arrays.asList("25", "20", "24", "26"), "25"),
            
            // Racines carrées
            new Question("Quelle est la racine carrée de 144 ?", 
                Arrays.asList("12", "11", "13", "10"), "12"),
            new Question("Quelle est la racine carrée de 169 ?", 
                Arrays.asList("13", "12", "14", "11"), "13"),
            new Question("Quelle est la racine carrée de 225 ?", 
                Arrays.asList("15", "14", "16", "13"), "15"),
            new Question("Quelle est la racine carrée de 400 ?", 
                Arrays.asList("20", "19", "21", "18"), "20"),
            
            // Fractions
            new Question("Combien font 1/4 + 1/4 ?", 
                Arrays.asList("1/2", "1/4", "2/4", "1/8"), "1/2"),
            new Question("Combien font 1/2 + 1/3 ?", 
                Arrays.asList("5/6", "2/5", "3/5", "1/5"), "5/6"),
            new Question("Combien font 3/4 - 1/2 ?", 
                Arrays.asList("1/4", "1/2", "2/4", "3/4"), "1/4"),
            
            // Pourcentages
            new Question("Combien font 50% de 200 ?", 
                Arrays.asList("100", "50", "150", "200"), "100"),
            new Question("Combien font 25% de 400 ?", 
                Arrays.asList("100", "50", "150", "200"), "100"),
            new Question("Combien font 75% de 300 ?", 
                Arrays.asList("225", "200", "250", "175"), "225"),
            
            // Puissances
            new Question("Combien font 2³ ?", 
                Arrays.asList("8", "6", "9", "4"), "8"),
            new Question("Combien font 3² ?", 
                Arrays.asList("9", "6", "8", "12"), "9"),
            new Question("Combien font 4³ ?", 
                Arrays.asList("64", "16", "32", "128"), "64"),
            new Question("Combien font 5² ?", 
                Arrays.asList("25", "10", "15", "20"), "25"),
            
            // Équations simples
            new Question("Résoudre x + 5 = 12, x = ?", 
                Arrays.asList("7", "6", "8", "5"), "7"),
            new Question("Résoudre 2x = 18, x = ?", 
                Arrays.asList("9", "8", "7", "10"), "9"),
            new Question("Résoudre x - 3 = 7, x = ?", 
                Arrays.asList("10", "9", "8", "11"), "10"),
            
            // Géométrie
            new Question("Combien de côtés a un triangle ?", 
                Arrays.asList("3", "4", "5", "6"), "3"),
            new Question("Combien de côtés a un carré ?", 
                Arrays.asList("4", "3", "5", "6"), "4"),
            new Question("Combien de côtés a un pentagone ?", 
                Arrays.asList("5", "4", "6", "3"), "5"),
            new Question("Combien de côtés a un hexagone ?", 
                Arrays.asList("6", "5", "7", "4"), "6"),
            
            // Aires et périmètres
            new Question("Quelle est l'aire d'un carré de côté 5 cm ?", 
                Arrays.asList("25 cm²", "20 cm²", "15 cm²", "10 cm²"), "25 cm²"),
            new Question("Quel est le périmètre d'un carré de côté 6 cm ?", 
                Arrays.asList("24 cm", "36 cm", "12 cm", "18 cm"), "24 cm"),
            
            // Nombres premiers
            new Question("Lequel de ces nombres est premier ?", 
                Arrays.asList("17", "15", "21", "27"), "17"),
            new Question("Lequel de ces nombres est premier ?", 
                Arrays.asList("19", "21", "25", "27"), "19"),
            
            // Calculs avancés
            new Question("Combien font (15 + 5) × 2 ?", 
                Arrays.asList("40", "30", "35", "45"), "40"),
            new Question("Combien font (20 - 5) × 3 ?", 
                Arrays.asList("45", "40", "35", "50"), "45")
        );

        // ==================== QUESTIONS DE CHIMIE ====================
        List<Question> chimie = Arrays.asList(
            // Symboles chimiques
            new Question("Quel est le symbole chimique de l'eau ?", 
                Arrays.asList("H2O", "CO2", "O2", "NaCl"), "H2O"),
            new Question("Quel est le symbole chimique du dioxyde de carbone ?", 
                Arrays.asList("CO2", "H2O", "O2", "CH4"), "CO2"),
            new Question("Quel est le symbole chimique de l'oxygène ?", 
                Arrays.asList("O2", "O", "O3", "H2O"), "O2"),
            new Question("Quel est le symbole chimique du sodium ?", 
                Arrays.asList("Na", "S", "So", "N"), "Na"),
            new Question("Quel est le symbole chimique du chlore ?", 
                Arrays.asList("Cl", "C", "Ch", "L"), "Cl"),
            
            // PH et acidité
            new Question("Quel est le pH de l'eau pure ?", 
                Arrays.asList("7", "5", "8", "10"), "7"),
            new Question("Quel est le pH d'un acide fort ?", 
                Arrays.asList("0-3", "7", "8-10", "11-14"), "0-3"),
            new Question("Quel est le pH d'une base forte ?", 
                Arrays.asList("11-14", "0-3", "7", "4-6"), "11-14"),
            
            // Gaz et atmosphère
            new Question("Quel gaz les plantes absorbent-elles pour la photosynthèse ?", 
                Arrays.asList("CO2", "O2", "N2", "H2"), "CO2"),
            new Question("Quel gaz les plantes rejettent-elles lors de la photosynthèse ?", 
                Arrays.asList("O2", "CO2", "N2", "H2O"), "O2"),
            new Question("Quel est le gaz le plus abondant dans l'atmosphère ?", 
                Arrays.asList("Azote (N2)", "Oxygène (O2)", "CO2", "Argon"), "Azote (N2)"),
            new Question("Quel gaz est responsable de l'effet de serre ?", 
                Arrays.asList("CO2", "O2", "N2", "H2"), "CO2"),
            
            // Éléments chimiques
            new Question("Quel est l'élément le plus léger ?", 
                Arrays.asList("Hydrogène", "Hélium", "Oxygène", "Carbone"), "Hydrogène"),
            new Question("Quel est le symbole chimique de l'or ?", 
                Arrays.asList("Au", "Ag", "Fe", "Cu"), "Au"),
            new Question("Quel est le symbole chimique de l'argent ?", 
                Arrays.asList("Ag", "Au", "Ar", "Hg"), "Ag"),
            new Question("Quel est le symbole chimique du fer ?", 
                Arrays.asList("Fe", "F", "Ir", "Fr"), "Fe"),
            new Question("Quel est le symbole chimique du cuivre ?", 
                Arrays.asList("Cu", "Co", "Cr", "C"), "Cu"),
            new Question("Quel est le symbole chimique du plomb ?", 
                Arrays.asList("Pb", "Pl", "P", "Ld"), "Pb"),
            new Question("Quel est le symbole chimique du mercure ?", 
                Arrays.asList("Hg", "Me", "Mr", "Mc"), "Hg"),
            
            // Composés courants
            new Question("Quel est le nom chimique du sel de table ?", 
                Arrays.asList("Chlorure de sodium", "Sulfate de sodium", "Carbonate de calcium", "Bicarbonate"), "Chlorure de sodium"),
            new Question("Quelle est la formule chimique du sel ?", 
                Arrays.asList("NaCl", "KCl", "CaCl2", "NaF"), "NaCl"),
            new Question("Quelle est la formule chimique du sucre ?", 
                Arrays.asList("C12H22O11", "C6H12O6", "C2H5OH", "CH4"), "C12H22O11"),
            new Question("Quelle est la formule chimique de l'alcool ?", 
                Arrays.asList("C2H5OH", "CH3OH", "C6H12O6", "C12H22O11"), "C2H5OH"),
            
            // Acides et bases
            new Question("Quel est l'acide présent dans le vinaigre ?", 
                Arrays.asList("Acide acétique", "Acide citrique", "Acide sulfurique", "Acide chlorhydrique"), "Acide acétique"),
            new Question("Quel est l'acide présent dans le citron ?", 
                Arrays.asList("Acide citrique", "Acide acétique", "Acide ascorbique", "Acide malique"), "Acide citrique"),
            new Question("Quel est l'acide présent dans l'estomac ?", 
                Arrays.asList("Acide chlorhydrique", "Acide sulfurique", "Acide nitrique", "Acide phosphorique"), "Acide chlorhydrique"),
            
            // Tableau périodique
            new Question("Combien d'éléments comporte le tableau périodique ?", 
                Arrays.asList("118", "108", "128", "98"), "118"),
            new Question("Quel est le numéro atomique de l'oxygène ?", 
                Arrays.asList("8", "6", "7", "9"), "8"),
            new Question("Quel est le numéro atomique du carbone ?", 
                Arrays.asList("6", "4", "5", "7"), "6"),
            
            // Réactions chimiques
            new Question("Quel est le produit de la réaction entre un acide et une base ?", 
                Arrays.asList("Sel + eau", "Acide + eau", "Base + eau", "Gaz + eau"), "Sel + eau"),
            new Question("Qu'appelle-t-on une réaction qui dégage de la chaleur ?", 
                Arrays.asList("Exothermique", "Endothermique", "Thermique", "Calorifique"), "Exothermique"),
            new Question("Qu'appelle-t-on une réaction qui absorbe de la chaleur ?", 
                Arrays.asList("Endothermique", "Exothermique", "Thermique", "Calorifique"), "Endothermique"),
            
            // États de la matière
            new Question("Quel est le passage de l'état liquide à l'état gazeux ?", 
                Arrays.asList("Vaporisation", "Condensation", "Solidification", "Fusion"), "Vaporisation"),
            new Question("Quel est le passage de l'état gazeux à l'état liquide ?", 
                Arrays.asList("Condensation", "Vaporisation", "Solidification", "Fusion"), "Condensation"),
            new Question("Quel est le passage de l'état liquide à l'état solide ?", 
                Arrays.asList("Solidification", "Fusion", "Vaporisation", "Condensation"), "Solidification"),
            
            // Atomes et molécules
            new Question("De quoi est composé un atome ?", 
                Arrays.asList("Protons, neutrons, électrons", "Protons seulement", "Neutrons seulement", "Électrons seulement"), "Protons, neutrons, électrons"),
            new Question("Quelle est la charge d'un proton ?", 
                Arrays.asList("Positive", "Négative", "Neutre", "Variable"), "Positive"),
            new Question("Quelle est la charge d'un électron ?", 
                Arrays.asList("Négative", "Positive", "Neutre", "Variable"), "Négative"),
            new Question("Quelle est la charge d'un neutron ?", 
                Arrays.asList("Neutre", "Positive", "Négative", "Variable"), "Neutre"),
            
            // Chimie organique
            new Question("Quel est l'élément de base de la chimie organique ?", 
                Arrays.asList("Carbone", "Oxygène", "Hydrogène", "Azote"), "Carbone"),
            new Question("Quelle est la formule du méthane ?", 
                Arrays.asList("CH4", "C2H6", "C3H8", "C4H10"), "CH4"),
            new Question("Quelle est la formule de l'éthane ?", 
                Arrays.asList("C2H6", "CH4", "C3H8", "C4H10"), "C2H6"),
            
            // Chimie nucléaire
            new Question("Qu'est-ce qu'un isotope ?", 
                Arrays.asList("Atomes avec même nombre de protons mais différents neutrons", 
                            "Atomes avec différents protons", 
                            "Atomes avec différents électrons", 
                            "Atomes radioactifs"), 
                "Atomes avec même nombre de protons mais différents neutrons"),
            
            // Applications pratiques
            new Question("Quel métal est liquide à température ambiante ?", 
                Arrays.asList("Mercure", "Fer", "Cuivre", "Aluminium"), "Mercure"),
            new Question("Quel gaz utilise-t-on pour gonfler les ballons ?", 
                Arrays.asList("Hélium", "Hydrogène", "Oxygène", "Azote"), "Hélium"),
            new Question("Quel métal est le meilleur conducteur d'électricité ?", 
                Arrays.asList("Argent", "Cuivre", "Or", "Aluminium"), "Argent")
        );

        banqueQuestions.put("anglais", anglais);
        banqueQuestions.put("maths", maths);
        banqueQuestions.put("chimie", chimie);
    }

    public Quiz genererQuiz(String matiere, int nombreQuestions) {
        Quiz quiz = new Quiz();
        quiz.setMatiere(matiere);
        
        // Titre personnalisé selon la matière
        String titre = switch (matiere.toLowerCase()) {
            case "anglais" -> "📚 Quiz d'Anglais";
            case "maths" -> "📐 Quiz de Mathématiques";
            case "chimie" -> "🧪 Quiz de Chimie";
            default -> "Quiz de " + matiere;
        };
        quiz.setTitre(titre);
        
        List<Question> questionsMatiere = banqueQuestions.get(matiere.toLowerCase());
        List<Question> questionsSelectionnees = new ArrayList<>();
        
        if (questionsMatiere != null && !questionsMatiere.isEmpty()) {
            // Limiter au nombre de questions disponibles
            int taille = Math.min(nombreQuestions, questionsMatiere.size());
            
            // Mélanger les questions pour avoir des questions aléatoires
            List<Question> questionsCopie = new ArrayList<>(questionsMatiere);
            Collections.shuffle(questionsCopie);
            
            // Prendre les premières 'taille' questions
            for (int i = 0; i < taille; i++) {
                Question q = questionsCopie.get(i);
                // Créer une copie pour éviter les références partagées
                Question nouvelleQuestion = new Question(
                    q.getTexte(),
                    new ArrayList<>(q.getOptions()),
                    q.getBonneReponse()
                );
                questionsSelectionnees.add(nouvelleQuestion);
            }
        }
        
        quiz.setQuestions(questionsSelectionnees);
        return quiz;
    }

    public int calculerScore(Quiz quiz) {
        if (quiz == null || quiz.getQuestions() == null) {
            return 0;
        }
        
        int score = 0;
        for (Question question : quiz.getQuestions()) {
            if (question.getReponseUtilisateur() != null && 
                question.getBonneReponse() != null &&
                question.getReponseUtilisateur().equalsIgnoreCase(question.getBonneReponse())) {
                score++;
            }
        }
        return score;
    }
    
    // Méthode utilitaire pour obtenir le nombre de questions disponibles par matière
    public int getNombreQuestionsDisponibles(String matiere) {
        List<Question> questions = banqueQuestions.get(matiere.toLowerCase());
        return questions != null ? questions.size() : 0;
    }
    
    // Méthode pour obtenir toutes les matières disponibles
    public Set<String> getMatieresDisponibles() {
        return banqueQuestions.keySet();
    }
}