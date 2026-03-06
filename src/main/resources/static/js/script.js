// Animations et interactions supplémentaires
document.addEventListener('DOMContentLoaded', function() {
    // Animation pour les cards
    const cards = document.querySelectorAll('.card');
    cards.forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-5px)';
        });
        card.addEventListener('mouseleave', function() {
            this.style.transform = 'translateY(0)';
        });
    });

    // Validation du formulaire de quiz
    const quizForm = document.getElementById('quizForm');
    if (quizForm) {
        quizForm.addEventListener('submit', function(e) {
            const radiosPerQuestion = {};
            const questions = document.querySelectorAll('.question-card');
            
            questions.forEach((question, index) => {
                const radios = question.querySelectorAll('input[type="radio"]');
                let checked = false;
                
                radios.forEach(radio => {
                    if (radio.checked) checked = true;
                });
                
                if (!checked) {
                    e.preventDefault();
                    alert(`Veuillez répondre à la question ${index + 1}`);
                    question.scrollIntoView({ behavior: 'smooth' });
                    return;
                }
            });
        });
    }

    // Compteur de questions répondues
    const updateProgress = () => {
        const totalQuestions = document.querySelectorAll('.question-card').length;
        const answeredQuestions = document.querySelectorAll('input[type="radio"]:checked').length;
        
        const progressBar = document.querySelector('.quiz-progress');
        if (progressBar) {
            const percentage = (answeredQuestions / totalQuestions) * 100;
            progressBar.style.width = percentage + '%';
            progressBar.textContent = Math.round(percentage) + '%';
        }
    };

    const radios = document.querySelectorAll('input[type="radio"]');
    radios.forEach(radio => {
        radio.addEventListener('change', updateProgress);
    });
});