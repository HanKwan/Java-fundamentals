package quizGame;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to quiz game!");
        String[] questions = {"What does static mean in Java?",
                            "Which keyword is used to create an object?",
                            "What is the correct type for text in Java?",
                            "What does == compare?",
                            "Which one is resizable?"};

        String[][] options = {{"A. Object-specific", "B. Belongs to class", "C. Cannot be used in methods", "D. Runs faster"},
                            {"class", "void", "new", "this"},
                            {"string", "String", "text", "char[] only"},
                            {"Values only", "Memory reference", "Strings only", "Objects only"},
                            {"array", "int", "ArrayList", "String"}};

        String[] answers = {"B", "C", "B", "B", "C"};

        
    }
}
