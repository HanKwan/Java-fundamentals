package quizGame;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to quiz game!");
        System.out.println("---------------------");
        String[] questions = {"What does static mean in Java?",
                            "Which keyword is used to create an object?",
                            "What is the correct type for text in Java?",
                            "What does == compare?",
                            "Which one is resizable?"};

        String[][] options = {{"A. Object-specific", "B. Belongs to class", "C. Cannot be used in methods", "D. Runs faster"},
                            {"A. class", "B. void", "C. new", "D. this"},
                            {"A. string", "B. String", "C. text", "D. char[] only"},
                            {"A. Values only", "B. Memory reference", "C. Strings only", "D. Objects only"},
                            {"A. array", "B. int", "C. ArrayList", "D. String"}};

        String[] answers = {"B", "C", "B", "B", "C"};

        for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);

            }

            System.out.print("Choose your answer: ");
            String useAns = scanner.next().toUpperCase().trim();

            if (useAns.equals(answers[i])) {
                System.out.println("Correct! The answer was " + answers[i]);
            } else {
                System.out.println("Wrong! The answer was " + answers[i]);
            }

            System.out.println("------------------------");
        }
    }
}
