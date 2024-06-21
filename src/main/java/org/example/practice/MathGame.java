package org.example.practice;

import java.util.Random;
import java.util.Scanner;

public class MathGame {

    public static int score = 0;

    public static void printQuestion(int num1, String op, int num2)
    {
        String question = "What is "+ num1 + op + num2 + "? ";
        System.out.print(question);
    }
    public static void answerFeedback(int userAnswer, int correctAnswer)
    {
        System.out.println("Your answer is: " + userAnswer);
        if(userAnswer == correctAnswer) {
            System.out.println("Congrats. You got the answer correct!");
            score += 1;
            System.out.println("Your score is now " + score);
        } else {
            System.out.println("Unfortunately, that is the wrong answer.");
            System.out.println("The correct answer is: " + correctAnswer);
        }
    }

    public static int addNums(int num1, int num2) {
        return num1 + num2;
    }
    public  static int subtractNums(int num1, int num2) {
        return num1 - num2;
    }
    public static int divideNums(int num1, int num2) {
        return num1 / num2;
    }
    public static int multiplyNums(int num1, int num2) {
        return num1 * num2;
    }
    public static void main(String[] args){
//         1. Ask User for their name
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scan.nextLine();
//         2. Print personalized welcome message
        System.out.println("Welcome " + name + "!");
//         3. Post 5 random questions to the user
//         4. Questions should regard addition, sub, multiply, or division
//         6. Compute the correct answer for each question through the code
//         7. Compare the user's answers with the correct answers
        Random random = new Random();

        for (int i=1; i <= 5; i++){
            int num1 = random.nextInt(10,20); // add 1 to ensure range 1-10
            int num2 = random.nextInt(10,20);
            int userAnswer;
            System.out.print("Question " + i + ": ");
            printQuestion(num1, "*", num2);
            userAnswer = scan.nextInt();
            answerFeedback(userAnswer, multiplyNums(num1, num2));
        }

//         8. Compute the final score, adding 1 score for each correct answer
//         9. Announce the final score on the screen, in a personalized message

        String goodbyeMessage = "Thanks for taking the math quiz, " + name + ".";
        System.out.println(goodbyeMessage);
        System.out.println("Your final score is " + score);
    }
}
